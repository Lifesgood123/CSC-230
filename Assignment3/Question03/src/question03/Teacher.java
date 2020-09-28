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
public class Teacher extends Person{
    private double salary;
    private String subject;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.salary = salary;
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return String.format(super.toString() 
                           + "Subject: %s%n"
                           + "Salary:  $%.2f%n", this.subject, this.salary);
    }
}