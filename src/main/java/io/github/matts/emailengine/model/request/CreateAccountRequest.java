package io.github.matts.emailengine.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Getter
@Setter
public class CreateAccountRequest {
    private String account;
    private String name;
    private String email;
    private List<String> path;
    private List<String> subconnections;
    private String webhooks;
    private Boolean copy;
    private Boolean logs;
    private String notifyFrom;
    private String proxy;
    private String smtpEhloName;
    private String imapIndexer;

}
