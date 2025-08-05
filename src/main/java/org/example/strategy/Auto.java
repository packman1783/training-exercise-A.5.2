package org.example.strategy;

public class Auto {
    private FillStrategy fillStrategy;
    private String model;

    public Auto(String model, FillStrategy fillStrategy) {
        this.model = model;
        this.fillStrategy = fillStrategy;
    }

    public void setFillStrategy(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

    public void fill() {
        System.out.println(model + ": ");
        fillStrategy.fill();
    }

    public void drive() {
        System.out.println(model + " Move!");
    }

    public void stop() {
        System.out.println(model + " Stop!");
    }
}
