package org.example.proxy;

public class SecurityProxy implements Door{
    private final Door door;
    private final String correctPassword;

    public SecurityProxy(Door door, String correctPassword) {
        this.door = door;
        this.correctPassword = correctPassword;
    }

    private boolean authenticate(String password) {
        return correctPassword.equals(password);
    }

    @Override
    public void open() {
        System.out.println("Access denied! Use open(password).");
    }

    @Override
    public void open(String password) {
        if (authenticate(password)) {
            door.open();
        } else {
            System.out.println("Access denied! Incorrect password.");
        }
    }

    @Override
    public void close() {
        door.close();
    }
}
