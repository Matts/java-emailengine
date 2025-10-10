package io.github.matts.emailengine.model.hook.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryJob {
    private String id;
    private Integer attemptsMade;
    private Integer attempts;
    private Date nextAttempt;
}
