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
public class Question02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String test = "123456789";
        System.out.println(recursiveStringLength(test) == test.length());
    }
    
    /**
     *
     * @param a
     * @return
     */
    public static int recursiveStringLength(String a){
        return recursiveStringLength(a, 0);
    }
    
    /**
     *
     * @param a
     * @param position
     * @return reversed String
     */
    public static int recursiveStringLength(String a, int pos){
        try{
            a.charAt(pos);
            return recursiveStringLength(a, pos + 1);
        } catch(StringIndexOutOfBoundsException e){
            return pos;
        }
    }
    
}
