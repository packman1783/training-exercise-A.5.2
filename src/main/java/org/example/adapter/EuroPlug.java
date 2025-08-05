package org.example.adapter;

public class EuroPlug implements Plug {
    @Override
    public void connect() {
        System.out.println("Connected to a Euro socket!");
    }
}