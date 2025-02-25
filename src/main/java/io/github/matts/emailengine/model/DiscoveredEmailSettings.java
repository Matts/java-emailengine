package io.github.matts.emailengine.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.github.matts.emailengine.model.EmailSettingsAppPassword;
import io.github.matts.emailengine.model.ResolvedServerSettings;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscoveredEmailSettings {
    @JsonSetter(nulls = Nulls.SKIP)
    private io.github.matts.emailengine.model.ResolvedServerSettings imap;
    @JsonSetter(nulls = Nulls.SKIP)
    private ResolvedServerSettings smtp;
    private String _source;
    private EmailSettingsAppPassword appPassword;
}
