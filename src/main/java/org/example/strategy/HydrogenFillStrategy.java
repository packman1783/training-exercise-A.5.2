package org.example.strategy;

public class HydrogenFillStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Hydrogen refuelling");
    }
}
