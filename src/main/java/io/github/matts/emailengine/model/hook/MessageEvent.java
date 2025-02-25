package io.github.matts.emailengine.model.hook;

import io.github.matts.emailengine.model.hook.data.AccountEventData;
import io.github.matts.emailengine.model.hook.data.MessageEventData;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MessageEvent extends Event {
    private MessageEventData data;

    @Builder
    public MessageEvent(String serviceUrl, String account, String date, Events event, MessageEventData data) {
        super(serviceUrl, account, date, event);
        this.data = data;
    }
}
