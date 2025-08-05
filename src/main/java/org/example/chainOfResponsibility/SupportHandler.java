package org.example.chainOfResponsibility;

public abstract class SupportHandler {
    private SupportHandler nextHandler;

    public SupportHandler setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public void handleRequest(SupportRequest request) {
        boolean handled = process(request);

        if (!handled && nextHandler != null) {
            nextHandler.handleRequest(request);
        } else if (!handled) {
            System.out.println("No one was able to process the request: " + request.getMessage());
        }
    }

    protected abstract boolean process(SupportRequest request);
}
