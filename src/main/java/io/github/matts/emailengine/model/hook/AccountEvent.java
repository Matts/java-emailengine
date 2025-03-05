package io.github.matts.emailengine.model.hook;

import io.github.matts.emailengine.model.hook.Event;
import io.github.matts.emailengine.model.hook.Events;
import io.github.matts.emailengine.model.hook.data.AccountEventData;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper=true, includeFieldNames=true)
public class AccountEvent extends Event {
    private AccountEventData data;

    @Builder
    public AccountEvent(String serviceUrl, String account, Date date, Events event, AccountEventData data) {
        super(serviceUrl, account, date, event);
        this.data = data;
    }
}
