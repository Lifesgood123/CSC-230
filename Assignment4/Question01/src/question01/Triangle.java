/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

/**
 *
 * @author ellie
 */
public class Triangle extends Shape{
    private double base, height;

    /**
     *
     * @param base
     * @param height
     * @param colour
     */
    public Triangle(double base, double height, String colour) {
        super(colour);
        this.base = base;
        this.height = height;
    }
    
    /**
     *
     * @return Area
     */
    @Override
    public double getArea(){
        return this.base * this.height;
    }

    /**
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", height=" + height + '}';
    }
    
    
    
}
