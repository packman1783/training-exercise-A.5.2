package org.example.decorator;

public class ScaleDecorator extends ShapeDecorator {
    private final double scaleFactor;

    public ScaleDecorator(Shape decoratedShape, double scaleFactor) {
        super(decoratedShape);
        this.scaleFactor = scaleFactor;
    }

    @Override
    public void draw() {
        super.draw();
        applyScaling();
    }

    private void applyScaling() {
        System.out.println("Scaling shape by factor: " + scaleFactor);
    }
}
