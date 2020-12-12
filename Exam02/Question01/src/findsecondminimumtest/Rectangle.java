package findsecondminimumtest;

/**
 * A class to represent a rectangle
 *
 * @author Chandana Ariyawansa
 */
public class Rectangle implements Comparable<Rectangle> {

    private int length;
    private int width;

    /**
     * Constructor of the rectangle
     *
     * @param length is the length
     * @param width is the width
     */
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Get the length
     *
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * Get the width
     *
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Set the length
     *
     * @param length is the new length
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Set the width
     *
     * @param width is the new width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Overridden toSting method
     *
     * @return the string representation of the rectangle
     */
    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }

    /**
     * Check the equality of two rectangles. Two rectangles are equal, if their
     * perimeters are equal.
     *
     * @param obj
     * @return true, if they are equal (false otherwise)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        if (this.length + this.width == ((Rectangle) obj).length + ((Rectangle) obj).width) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.length;
        hash = 71 * hash + this.width;
        return hash;
    }

    /**
     * Compare two rectangles based on their perimeters.
     *
     * @param o is the other rectangle
     * @return a positive value, if this > other. Zero if this = other. A
     * negative value if this < other
     */
    @Override
    public int compareTo(Rectangle o) {
        if (this.length + this.width > o.length + o.width) {
            return 1;
        } else if (this.length + this.width == o.length + o.width) {
            return 0;
        } else {
            return -1;
        }
    }
}
