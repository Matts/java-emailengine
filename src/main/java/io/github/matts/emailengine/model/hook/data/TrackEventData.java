package io.github.matts.emailengine.model.hook.data;

import lombok.Data;

@Data
public class TrackEventData {
    private String messageId;
    private String remoteAddress;
    private String url;
    private String userAgent;
}
