package io.github.matts.emailengine.model.hook;

import io.github.matts.emailengine.model.hook.Events;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Event {
    private String serviceUrl;
    private String account;
    private Date date;
    private Events event;
}
