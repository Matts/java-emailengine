package io.github.matts.emailengine.model;

import io.github.matts.emailengine.model.MessageReferenceAction;
import lombok.*;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Data
public class MessageReference {
    private String message;
    private MessageReferenceAction action;
    private Boolean inline;
    private Boolean forwardAttachments;
    private Boolean ignoreMissing;
    private String messageId;
}
