package br.com.schumaker.gof.structural.bridge.example1;

/**
 *
 * @author hudsonschumaker
 */
/** "ConcreteImplementor" */
public class DrawingAPIBresenham implements DrawingAPI{
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("ApiBresenham.circle at %f:%f radius %f\n", x, y, radius);
    }
}
