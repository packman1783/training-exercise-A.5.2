package org.example.chainOfResponsibility;

public class EngineerHandler extends SupportHandler {
    @Override
    protected boolean process(SupportRequest request) {
        if (request.getType() == RequestType.TECHNICAL) {
            System.out.println("The engineer processed: " + request.getMessage());
            return true;
        }

        return false;
    }
}
