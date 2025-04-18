package io.github.matts.emailengine.model;

import lombok.Data;

import java.util.List;

@Data
public class DeliveryEnvelope {
    private String from;
    private List<String> to;
}
