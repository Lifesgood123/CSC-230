package question01;

/**
 *
 * @author ellie
 */
public abstract class Shape {
    private String colour;
    
    /**
     *
     * @param colour
     */
    public Shape(String colour){
        this.colour = colour;
    }

    /**
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Shape{" + "colour=" + colour + '}';
    }
    
    /**
     *
     * @return Area
     */
    public abstract double getArea();
}
