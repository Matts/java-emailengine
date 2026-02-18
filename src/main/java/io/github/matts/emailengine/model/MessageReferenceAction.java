package io.github.matts.emailengine.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum MessageReferenceAction {
    forward("forward"),
    reply("reply"),
    @JsonProperty("reply-all")
    replyAll("reply-all");

    private final String value;

    MessageReferenceAction(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public static MessageReferenceAction fromString(String value) {
        for (MessageReferenceAction action : MessageReferenceAction.values()) {
            if (action.value.equalsIgnoreCase(value)) {
                return action;
            }
        }
        return MessageReferenceAction.replyAll;
    }
}
