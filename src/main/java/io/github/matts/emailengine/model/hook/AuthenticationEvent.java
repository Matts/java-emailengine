package io.github.matts.emailengine.model.hook;

import io.github.matts.emailengine.model.hook.Event;
import io.github.matts.emailengine.model.hook.Events;
import io.github.matts.emailengine.model.hook.data.AuthenticationEventData;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper=true, includeFieldNames=true)
public class AuthenticationEvent extends Event {
    private AuthenticationEventData data;

    @Builder
    public AuthenticationEvent(String serviceUrl, String account, Date date, Events event, AuthenticationEventData data) {
        super(serviceUrl, account, date, event);
        this.data = data;
    }
}
