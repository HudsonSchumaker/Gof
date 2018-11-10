package br.com.schumaker.gof.structural.bridge.example1;

/**
 *
 * @author hudsonschumaker
 */
public class BridgePattern {
    public static void main(final String[] args) {
        Shape[] shapes = new Shape[] {
            new CircleShape(1, 2, 3, new DrawingAPIGeneric()),
            new CircleShape(5, 7, 11, new DrawingAPIBresenham())
        };

        for (Shape shape : shapes) {
            shape.resizeByPercentage(2.5);
            shape.draw();
        }
    }
}
