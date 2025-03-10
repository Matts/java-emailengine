package io.github.matts.emailengine.model;

import io.github.matts.emailengine.model.AddressEntry;
import io.github.matts.emailengine.model.AttachmentEntry;
import io.github.matts.emailengine.model.BounceEntry;
import io.github.matts.emailengine.model.TextInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class MessageEntry {
    private String id;
    private String uid;
    private String emailId;
    private String threadId;
    private String date;
    private boolean draft;
    private boolean unseen;
    private boolean flagged;
    private int size;
    private String subject;
    private io.github.matts.emailengine.model.AddressEntry from;
    private List<io.github.matts.emailengine.model.AddressEntry> replyTo;
    private List<io.github.matts.emailengine.model.AddressEntry> to;
    private List<io.github.matts.emailengine.model.AddressEntry> cc;
    private List<AddressEntry> bcc;
    private String messageId;
    private String inReplyTo;
    private List<String> flags;
    private List<String> labels;
    private List<AttachmentEntry> attachments;
    private TextInfo text;
    private String preview;
    private List<BounceEntry> bounces;
    private boolean isAutoReply;
    private String specialUse;
    private String messageSpecialUse;

    public MessageEntry(String id, String uid, String content, String date, AddressEntry from, AddressEntry to) {
        this.id = id;
        this.messageId = id;
        this.uid = uid;
        this.subject = content;
        this.date = date;
        this.from = from;
        this.to = List.of(to);
    }
}
