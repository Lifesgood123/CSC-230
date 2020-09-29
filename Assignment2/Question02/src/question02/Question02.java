/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;
import java.util.Scanner;
/**
 *
 * @author ellie
 */
public class Question02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] input = getStrings();
        for( String line : input){
            System.out.println(line);
        }
    }
    
    public static String[] getStrings() {
        Scanner kb = new Scanner(System.in);
        String input;
        String[] retval = new String[0];
        while(true){
            input = kb.nextLine();
            if(input.isEmpty()) break;
            retval = resize(retval, retval.length + 1);
            retval[retval.length - 1] = input;
        }
        return retval;
    }
    
    public static String[] resize(String[] a, int newSize){
        String[] newArray = new String[newSize];
        for(int i = 0; i < a.length; i++){
            newArray[i] = a[i];
        }
        return newArray;
    }
    
}