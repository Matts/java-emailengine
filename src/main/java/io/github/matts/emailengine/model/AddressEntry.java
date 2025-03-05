package io.github.matts.emailengine.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class AddressEntry {
    private String name;
    private String address;

    public String toString() {
        return name + " <" + address + ">".trim();
    }

    public String toUniqueAddress() {
        // remove anything between a + and the @
        return address.toLowerCase()
                .replaceAll("\\+.*(?=@)", "")
                .replaceAll("[^a-z0-9@.-_~]", "")
                // remove any whitespaces
                .replaceAll("\\s", "")
                .trim();
    }
}
