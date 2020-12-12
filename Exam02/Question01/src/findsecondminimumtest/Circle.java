package findsecondminimumtest;

/**
 * A class to represent a Circle
 *
 * @author Chandana Ariyawansa
 */
public class Circle implements Comparable<Circle> {

    private int radius;

    /**
     * Create a circle with radius radius
     *
     * @param radius
     */
    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * Get the radius
     *
     * @return radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Set the radius of the circle to radius
     *
     * @param radius is the radius of the circle
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * Overridden toString method
     *
     * @return string representation of the circle
     */
    @Override
    public String toString() {
        return "Circle{" + "r=" + radius + '}';
    }

    /**
     * Check the equality of two circles based on the radius
     *
     * @param obj
     * @return true, if two circles are equal(or false otherwise)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        return this.radius == ((Circle) obj).radius;

    }

    /**
     * Compares two circles based in their radii
     *
     * @param o is a circle
     * @return a positive value if this > other, zero if this = other, else
     * return a negative value. All comparisons are based on the radius.
     */
    @Override
    public int compareTo(Circle o) {
        return this.radius - o.radius;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.radius;
        return hash;
    }

}
