/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.pkg3;

import java.util.NoSuchElementException;
import util.LinkedList;
import util.LinkedListIterator;

/**
 * This is for testing our Linked list
 *
 * @author Chandana
 */
public class Exam3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> theList = new LinkedList<>();
        /*--------------------------------- Question 1 testing -----------------------------*/
        // Question 1 testing code: insertBegin
        // Remove multiline comment below to test question 1
//        /* <- Remove this comment 
        theList.insertBegin(4);
        theList.insertBegin(3);
        theList.insertBegin(2);
        theList.insertBegin(1);
        // print the current content
        // This should print 1->2->3->4->
        System.out.print("List content: ");
        theList.printList();
//        */      
        /*--------------------------------- End of Question 1 testing ----------------------*/
     
        theList.makeEmpty(); // make the list empty. DO not delete

        /*--------------------------------- Question 2 testing -----------------------------*/
        // Question 2 testing code: insertEnd
        // Remove multiline comment below to test question 2
//        /* <- Remove this comment 
        theList.insertEnd(1);
        theList.insertEnd(2);
        theList.insertEnd(3);
        theList.insertEnd(4);
      
        // print the current content
        // This should print 1->2->3->4->
        System.out.print("List content: ");
        theList.printList();
 //       */
        /*--------------------------------- End of Question 2 testing ----------------------*/
        
        theList.makeEmpty(); // make the list empty. DO not delete
        
        /*--------------------------------- Question 3 testing -----------------------------*/
        // Question 3: Testing findLargest
        // Remove multiline comment below to test question 3
 //       /* <- Remove this comment 
        // testing with an empty list should throw the exception
        try {
            LinkedListIterator<Integer> itr = theList.findLargest();
        } catch (NoSuchElementException e) {
            System.out.println(e.toString());
        }
        // Now Tetsing with a non empty list

        theList.insertEnd(10);
        theList.insertEnd(8);
        theList.insertEnd(25);
        theList.insertEnd(80);
        theList.insertEnd(8);
        theList.insertEnd(50);
        // print the current content
        System.out.print("List content: ");
        theList.printList();
        // This should print 80 as the answer
        System.out.println("Largest value of the above list:" + theList.findLargest().retrieve());
 //       */ 
        /*--------------------------------- End of Question 3 testing ----------------------*/
        
        theList.makeEmpty(); // make the list empty. DO not delete
        
        /*--------------------------------- Question 4 testing -----------------------------*/
        // Question 4: Testing insertBeforeFirstLargest
        // Remove multiline comment below to test question 4
        // Let's insert 12 to the above list (10->8->25->80->8->50->)
//        /* <- Remove this comment 
        theList.insertEnd(10);
        theList.insertEnd(8);
        theList.insertEnd(25);
        theList.insertEnd(80);
        theList.insertEnd(8);
        theList.insertEnd(50);
        // print the current content
        System.out.print("List before insertion: ");
        theList.printList();     
        theList.insertBeforeFirstLargest(12);
        System.out.print("List after inserting 12: ");
        // Output: 10->8->12->25->80->8->50->
        theList.printList();
//        */ 
        /*--------------------------------- End of Question 4 testing ----------------------*/
    }
}
