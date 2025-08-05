package org.example.strategy;

public class HybridFillStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Fueled by your choice of gas or electricity!");
    }
}
