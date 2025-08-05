package org.example.strategy;

public class StandardFillStrategy implements FillStrategy{
    @Override
    public void fill() {
        System.out.println("Gasoline refueling");
    }
}
