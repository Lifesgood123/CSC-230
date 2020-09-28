/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author ellie
 */
public class Student extends Person{
    private String idNum;
    private double GPA;

    public Student(String name, int age, String gender, String idNum, double GPA) {
        super(name, age, gender);
        this.idNum = idNum;
        this.GPA = GPA;
    }

    public String getIdNum() {
        return idNum;
    }

    public double getGPA() {
        return GPA;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return String.format(super.toString()
            + "IdNum:   %s%n"
            + "GPA:     %s%n", this.idNum, this.GPA);
    }
    
    
}
