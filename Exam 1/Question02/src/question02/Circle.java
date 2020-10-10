package question02;

/**
 *
 * @author ellie
 */

import java.util.ArrayList;

public class Circle {

    private int x;
    private int y;
    private int radius;

    /**
     *
     * @param x
     * @param y
     * @param radius
     */
    public Circle(int x, int y, int radius) {
        this.setX(x);
        this.setY(y);
        this.setRadius(radius);
    }

    /**
     *
     */
    public Circle() {
        this(0, 0, 1);
    }

    /**
     *
     * @return
     */
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    /**
     *
     * @return
     */
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public boolean contains(int x, int y) {
        return this.radius >= getDistance(this.x, this.y, x, y);
    }

    private static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(
                Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)
        );
    }

    /**
     *
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @return
     */
    public int getRadius() {
        return radius;
    }

    /**
     *
     * @param radius
     */
    public void setRadius(int radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("negative radius");
        }
        this.radius = radius;
    }

    /**
     *
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Circle other = (Circle) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        if (this.radius != other.radius) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + this.x;
        hash = 31 * hash + this.y;
        hash = 31 * hash + this.radius;
        return hash;
    }

    @Override
    public String toString() {
        return "Circle{" + "x=" + x + ", y=" + y + ", radius=" + radius + '}';
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// ArrayList to store circles
        ArrayList<Circle> arr = new ArrayList<>();
// Adding circles to the array list
        arr.add(new Circle());
        arr.add(new Circle(1, 2, 10));
        try {
            arr.add(new Circle(4, -17, -100));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.toString());
        }
        System.out.println();
        arr.add(new Circle(3, 10, 20));
        arr.add(new Circle(2, 2, 15));
        arr.add(new Circle(5, 3, 10));
        arr.add(new Circle(7, 9, 15));
        arr.add(new Circle(8, 5, 2));
        arr.add(new Circle(1, 0, 1));
// Containment check for a few elements
        System.out.println(arr.contains(null));
        System.out.println(arr.contains("hello"));
        System.out.println(arr.contains(10));
        System.out.println(arr.contains(new Circle(5, 3, 10)));
        System.out.println();
// Test a point is inside or outside of the given circle
        System.out.println(arr.get(1).contains(0, 0));
        System.out.println(arr.get(1).contains(-9, 2));
        System.out.println(arr.get(1).contains(-10, 2));
        System.out.println(arr.get(1));
    }

}
