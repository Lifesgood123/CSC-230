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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "Agender", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
        
    
}}
