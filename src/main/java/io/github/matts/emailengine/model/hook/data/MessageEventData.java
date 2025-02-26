package io.github.matts.emailengine.model.hook.data;

import lombok.Data;

@Data
public class MessageEventData {
    private String id;
    private String emailId;
    private String messageId;
}
