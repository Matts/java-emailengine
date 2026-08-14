package io.github.matts.emailengine.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class AddressEntry {

    private static final Pattern ANGLE_ADDRESS = Pattern.compile("<\\s*([^<>\\s]+@[^<>\\s]+?)\\s*>");
    private static final Pattern BARE_ADDRESS =
            Pattern.compile("[A-Za-z0-9!#$%&'*+/=?^_`{|}~.-]+@[A-Za-z0-9-]+(?:\\.[A-Za-z0-9-]+)+");

    private String name;
    private String address;

    public String toString() {
        return (name == null ? "" : name) + " <" + (address == null ? "" : address) + ">";
    }

    /**
     * The address to use downstream. A malformed header - very common in spam - makes the parser treat the
     * whole {@code "Display Name" <mail@example.com>} string as the display name and leave the address empty;
     * in that case the address is recovered from the name.
     *
     * @return the usable address, or {@code null} when neither field contains one.
     */
    public String effectiveAddress() {
        if (address != null && !address.isBlank()) {
            return address.trim();
        }
        return extractAddress(name);
    }

    /**
     * @return the display name with any raw address stripped off it, or {@code null} when nothing is left.
     */
    public String effectiveName() {
        if (address != null && !address.isBlank()) {
            return name;
        }
        return extractDisplayName(name);
    }

    /**
     * @return whether an address can be determined at all. Callers that cannot work without one should check
     * this instead of {@code getAddress() != null}.
     */
    public boolean hasAddress() {
        return effectiveAddress() != null;
    }

    /**
     * Lowercased address with sub-addressing and any disallowed characters stripped. Returns an empty string
     * when no address can be determined - never throws, so callers keep control over how to handle that.
     */
    public String toUniqueAddress() {
        String effective = effectiveAddress();
        if (effective == null) {
            return "";
        }
        // remove anything between a + and the @
        return effective.toLowerCase()
                .replaceAll("\\+.*(?=@)", "")
                .replaceAll("[^a-z0-9@.\\-_~]", "")
                // remove any whitespaces
                .replaceAll("\\s", "")
                .trim();
    }

    private static String extractAddress(String raw) {
        if (raw == null || raw.isBlank()) {
            return null;
        }
        Matcher angle = ANGLE_ADDRESS.matcher(raw);
        if (angle.find()) {
            return angle.group(1).trim();
        }
        Matcher bare = BARE_ADDRESS.matcher(raw);
        if (bare.find()) {
            return bare.group().trim();
        }
        return null;
    }

    private static String extractDisplayName(String raw) {
        if (raw == null) {
            return null;
        }
        String candidate = raw;
        int angleStart = candidate.indexOf('<');
        if (angleStart >= 0) {
            candidate = candidate.substring(0, angleStart);
        } else {
            String bare = extractAddress(candidate);
            if (bare != null) {
                candidate = candidate.replace(bare, "");
            }
        }
        candidate = candidate.replaceAll("^[\"'\\s]+", "").replaceAll("[\"'\\s]+$", "").trim();
        return candidate.isEmpty() ? null : candidate;
    }
}
