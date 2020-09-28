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
public class CollegeStudent extends Student{
    private static final String[] yearStrings = new String[] {"Freshman", "Sophmore", "Juniour", "Senior"};
    private String major;
    private int year;

    @Override
    public String toString() {
        return String.format(
            super.toString() + "Major:   %s%n"
                             + "Year:    %s%n", this.major, yearStrings[this.year-1]
        );
    }

    public CollegeStudent(String name, int age, String gender, String idNum, double GPA, int year,String major) {
        super(name, age, gender, idNum, GPA);
        this.major = major;
        this.year= year;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}

