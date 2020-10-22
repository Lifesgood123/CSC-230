package question01;

/**
 *
 * @author ellie
 */

public class Circle extends Shape{

    private int radius;

    /**
     *
     * @param radius
     * @param colour
     */
    public Circle(int radius, String colour) {
        super(colour);
        this.radius = radius;
    }

    /**
     *
     * @return area
     */
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    /**
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
}

