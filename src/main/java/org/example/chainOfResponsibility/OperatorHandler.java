package org.example.chainOfResponsibility;

public class OperatorHandler extends SupportHandler {
    @Override
    protected boolean process(SupportRequest request) {
        if (request.getType() == RequestType.SIMPLE) {
            System.out.println("The operator processed: " + request.getMessage());
            return true;
        }

        return false;
    }
}
