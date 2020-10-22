package question01;

/**
 *
 * @author ellie
 */
public class Rectangle extends Shape{
    private double length, width;
    
    /**
     *
     * @param length
     * @param width
     * @param colour
     */
    public Rectangle(double length, double width,String colour){
        super(colour);
        this.length = length;
        this.width = width;
    }
    
    /**
     *
     * @return Area
     */
    @Override
    public double getArea(){
        return this.length * this.width;
    }

    /**
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
    
    
}
