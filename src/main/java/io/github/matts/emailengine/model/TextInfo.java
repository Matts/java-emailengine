package io.github.matts.emailengine.model;

import io.github.matts.emailengine.model.EncodedSize;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class TextInfo {
    private String id;
    private EncodedSize encodedSize;
    private String plain;
    private String html;
    private boolean hasMore;
}
