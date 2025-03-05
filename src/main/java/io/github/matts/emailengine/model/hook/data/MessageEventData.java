package io.github.matts.emailengine.model.hook.data;

import io.github.matts.emailengine.model.AddressEntry;
import io.github.matts.emailengine.model.TextInfo;
import lombok.Data;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Data
public class MessageEventData {
    private String id;
    private Integer uid;
    private String path;
    private String emailId;
    private String threadId;
    private Date date;
    private String messageId;
    private HashMap<String, ChangeData> changes;
    private List<String> flags;
    private List<String> labels;
    private Boolean unseen;
    private Integer size;
    private String subject;
    private AddressEntry from;
    private List<AddressEntry> replyTo;
    private AddressEntry sender;
    private List<AddressEntry> to;
    private List<AddressEntry> cc;
    private List<AddressEntry> bcc;
    private TextInfo text;
    private String category;
    private Boolean isAutoReply;
    private Boolean seemsLikeNew;
    private String messageSpecialUse;
}
