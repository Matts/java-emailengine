package io.github.matts.emailengine.model;

import io.github.matts.emailengine.model.BounceResponse;

public class BounceEntry {
    private String message;
    private String recipient;
    private String action;
    private BounceResponse response;
    private String date;
}
