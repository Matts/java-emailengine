package io.github.matts.emailengine.model.response;

import io.github.matts.emailengine.model.MessageEntry;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class MessageList {
    private int total;
    private int page;
    private int pages;
    private String nextPageCursor;
    private String previousPageCursor;
    private List<MessageEntry> messages;
}
