package io.github.matts.emailengine.model.hook.data;

import io.github.matts.emailengine.model.DeliveryEnvelope;
import lombok.Data;

@Data
public class DeliveryEventData {
    private String messageId;
    private String response;
    private String queueId;
    private DeliveryEnvelope envelope;
    private String error;
    private String errorCode;
    private Integer smtpResponseCode;
    private DeliveryJob job;
}
