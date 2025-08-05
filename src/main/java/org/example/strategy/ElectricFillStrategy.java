package org.example.strategy;

public class ElectricFillStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Charging with electricity");
    }
}
