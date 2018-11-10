package br.com.schumaker.gof.structural.bridge.example1;

/**
 *
 * @author hudsonschumaker
 */

/** "ConcreteImplementor" */
public class DrawingAPIGeneric implements DrawingAPI{
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("ApiGeneric.circle at %f:%f radius %f\n", x, y, radius);
    }
}
