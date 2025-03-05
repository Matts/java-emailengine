package io.github.matts.emailengine.model.hook;

import io.github.matts.emailengine.model.hook.data.AccountEventData;
import io.github.matts.emailengine.model.hook.data.MessageEventData;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper=true, includeFieldNames=true)
public class MessageEvent extends Event {
    private String path;
    private String specialUse;
    private MessageEventData data;

    @Builder
    public MessageEvent(String serviceUrl, String account, Date date, Events event, MessageEventData data, String path, String specialUse) {
        super(serviceUrl, account, date, event);
        this.data = data;
        this.path = path;
        this.specialUse = specialUse;
    }
}
