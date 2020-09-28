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
public class Main {
    public static void main(String[] args){
        Book toc = new Book ("Theory of Computation", new Author
                        ("Michael Sipser", "msipser@mit.edu", 'm'), 200.00, 12);
        System.out.println(toc + "\n\n\n\n");
        Author sipser = new Author ("Michael Sipser", "msipser@mit.edu", 'm');
        Book Othertoc = new Book ("Theory of Computation", sipser, 200.00, 12);
        System.out.println(Othertoc);
    }
}
