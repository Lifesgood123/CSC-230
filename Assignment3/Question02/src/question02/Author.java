/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

/**
 *
 * @author ellie
 */
public class Author {

    private String name;
    private String email;
    private int age;
    
    public Author(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    @Override
    public String toString(){
        return String.format(    "Name   %s%n"
                               + "Age:   %s%n"
                               + "Email: %s%n",
                this.getName(), this.getAge(), this.getEmail());
    }
}
