package org.example.chainOfResponsibility;

public class ManagerHandler extends SupportHandler {
    @Override
    protected boolean process(SupportRequest request) {
        if (request.getType() == RequestType.DIFFICULT) {
            System.out.println("The manager processed:" + request.getMessage());
            return true;
        }

        return false;
    }
}
