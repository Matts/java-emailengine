package io.github.matts.emailengine.model;

import io.github.matts.emailengine.model.MailboxResponseStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailboxEntry {
    private String path;
    private String delimiter;
    private String parentPath;
    private String name;
    private boolean listed;
    private boolean subscribed;
    private String specialUse;
    private String specialUseSource;
    private boolean noInferiors;
    private int messages;
    private int uidNext;
    private MailboxResponseStatus status;
}
