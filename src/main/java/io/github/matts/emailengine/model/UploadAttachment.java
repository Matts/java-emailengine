package io.github.matts.emailengine.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UploadAttachment {
    private String filename;
    private String content;
    private String contentType;
    private String contentDisposition;
    private String cid;
    private String encoding;
    private String reference;

    public UploadAttachment(String filename, String content, String contentType) {
        this.filename = filename;
        this.content = content;
        this.contentType = contentType;
    }
}
