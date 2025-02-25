package io.github.matts.emailengine.model.hook;

import io.github.matts.emailengine.model.hook.Events;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Event {
    private String serviceUrl;
    private String account;
    private String date;
    private Events event;
}
