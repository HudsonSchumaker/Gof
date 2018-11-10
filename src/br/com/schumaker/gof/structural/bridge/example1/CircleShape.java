package br.com.schumaker.gof.structural.bridge.example1;

/**
 *
 * @author hudsonschumaker
 */
public class CircleShape extends Shape{

    private final double x;
    private final double y;
    private double radius;

    public CircleShape(final double x, final double y, final double radius, final DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;  this.y = y;  this.radius = radius;
    }

    @Override
    public void draw() { // low-level i.e. Implementation specific
        drawingAPI.drawCircle(x, y, radius);
    }
    
    @Override
    public void resizeByPercentage(final double pct) { // high-level i.e. Abstraction specific
        radius *= (1.0 + pct/100.0);
    }
    
}
