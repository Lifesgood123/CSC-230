package question01;

/**
 *
 * @author ellie
 */
public class Question01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape[] arr = {new Circle(10, "Red"), new Rectangle(3, 4, "Black"),
            new Circle(50, "Gary"), new Rectangle(10, 20, "Green")};
        for(Shape s: arr){
            System.out.println(s.getClass() + "-->" + s.getArea());
        }
    }
    
    
}
