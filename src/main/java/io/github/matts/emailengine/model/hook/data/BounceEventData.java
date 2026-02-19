package io.github.matts.emailengine.model.hook.data;

import io.github.matts.emailengine.model.DeliveryEnvelope;
import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
public class BounceEventData {
    private String bounceMessage;
    private String recipient;
    private String action;
    private String mta;
    private String messageId;
    private HashMap<String, List<String>> messageHeaders;
}
