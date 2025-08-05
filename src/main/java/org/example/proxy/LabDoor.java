package org.example.proxy;

public class LabDoor implements Door{
    @Override
    public void open() {
        System.out.println("The lab door is open");
    }

    @Override
    public void open(String password) {
        open();
    }

    @Override
    public void close() {
        System.out.println("The lab door is closed");
    }
}
