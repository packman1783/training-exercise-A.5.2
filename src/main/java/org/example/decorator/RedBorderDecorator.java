package org.example.decorator;

public class RedBorderDecorator extends ShapeDecorator {
    public RedBorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        applyRedBorder();
    }

    private void applyRedBorder() {
        System.out.println("Adding red border");
    }
}
