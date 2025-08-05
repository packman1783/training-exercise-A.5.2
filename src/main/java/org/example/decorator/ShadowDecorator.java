package org.example.decorator;

public class ShadowDecorator extends ShapeDecorator {
    public ShadowDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        applyShadow();
    }

    private void applyShadow() {
        System.out.println("Adding shadow effect");
    }
}
