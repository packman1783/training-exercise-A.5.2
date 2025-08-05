package org.example.proxy;

public class VaultDoor implements Door {
    @Override
    public void open() {
        System.out.println("The vault door is open.");
    }

    @Override
    public void open(String password) {
        open();
    }

    @Override
    public void close() {
        System.out.println("The vault door is closed.");
    }
}
