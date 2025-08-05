package org.example.chainOfResponsibility;

public class SupportRequest {
    private final RequestType type;
    private final String message;

    public SupportRequest(RequestType type, String message) {
        this.type = type;
        this.message = message;
    }

    public RequestType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}
