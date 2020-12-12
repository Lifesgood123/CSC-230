package util;
import java.util.NoSuchElementException;

// LinkedList class
// CONSTRUCTION: with no initializer
// Access is via LinkedListIterator class
//
// ******************PUBLIC OPERATIONS*********************
// boolean isEmpty( )     --> Return true if empty; else false
// void makeEmpty( )      --> Remove all items
// LinkedListIterator zeroth( )
//                        --> Return position to prior to first
// LinkedListIterator first( )
//                        --> Return first position
// void insert( x, p )    --> Insert x after current iterator position p
// void remove( x )       --> Remove x
// LinkedListIterator find( x )
//                        --> Return position that views x
// LinkedListIterator findPrevious( x )
//                        --> Return position prior to x
// ******************ERRORS********************************
// No special errors
/**
 * Linked list implementation of the list using a header node.Access to the list
 * is via LinkedListIterator.
 *
 * @param <AnyType>
 * @see LinkedListIterator
 */
public class LinkedList<AnyType extends Comparable<? super AnyType>> {

    private final ListNode<AnyType> header;

    /**
     * Construct the list
     */
    public LinkedList() {
        header = new ListNode<>(null);
    }

    /**
     * Test if the list is logically empty.
     *
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty() {
        return header.next == null;
    }

    /**
     * Make the list logically empty.
     */
    public void makeEmpty() {
        header.next = null;
    }

    /**
     * Return an iterator representing the header node.
     *
     * @return
     */
    public LinkedListIterator<AnyType> zeroth() {
        return new LinkedListIterator<>(header);
    }

    /**
     * Return an iterator representing the first node in the list.This operation
     * is valid for empty lists.
     *
     * @return
     */
    public LinkedListIterator<AnyType> first() {
        return new LinkedListIterator<>(header.next);
    }

    /**
     * Insert after p.
     *
     * @param x the item to insert.
     * @param p the position prior to the newly inserted item.
     */
    public void insert(AnyType x, LinkedListIterator<AnyType> p) {
        if (p != null && p.current != null) {
            p.current.next = new ListNode<>(x, p.current.next);
        }
    }

    /**
     * Return iterator corresponding to the first node containing an item.
     *
     * @param x the item to search for.
     * @return an iterator; iterator is not valid if item is not found.
     */
    public LinkedListIterator<AnyType> find(AnyType x) {
        ListNode<AnyType> ref = header.next;

        while (ref != null && !ref.element.equals(x)) {
            ref = ref.next;
        }

        return new LinkedListIterator<>(ref);
    }

    /**
     * Return iterator prior to the first node containing an item.
     *
     * @param x the item to search for.
     * @return appropriate iterator if the item is found. Otherwise, the
     * iterator corresponding to the last element in the list is returned.
     */
    public LinkedListIterator<AnyType> findPrevious(AnyType x) {
        ListNode<AnyType> ref = header;

        while (ref.next != null && !ref.next.element.equals(x)) {
            ref = ref.next;
        }

        return new LinkedListIterator<>(ref);
    }

    /**
     * Remove the first occurrence of an item.
     *
     * @param x the item to remove.
     */
    public void remove(AnyType x) {
        LinkedListIterator<AnyType> p = findPrevious(x);

        if (p.current.next != null) {
            p.current.next = p.current.next.next;  // Bypass deleted node
        }
    }

    /**
     * Insert an element at the beginning of the list
     *
     * @param x is the element
     */
    public void insertBegin(AnyType x) {
        LinkedListIterator<AnyType> p;
        p = zeroth();
        p.current.next = new ListNode(x, this.first().current);
    }
    
    /**
     * Insert an element at the end of the list
     *
     * @param x is the element
     */
    public void insertEnd(AnyType x) {
        LinkedListIterator<AnyType> p;
        p = first();
        if( p.current == null){
            insertBegin(x);
        } else {
            while(p.current.next != null) {
                p.advance(); // Advance until last valid element in the list
            }
            p.current.next = new ListNode(x);
        }
    }
    
    
    /**
     * Find the largest element of the list
     *
     * @return a LinkedListIterator for that element if list is non empty,
     * otherwise return an invalid iterator
     */
    
    public LinkedListIterator<AnyType> findLargest() {
        if(listSize() == 0) throw new NoSuchElementException("Empty List");
        LinkedListIterator<AnyType> p = first();
        AnyType largest = p.retrieve();
        while(p.isValid()){
            if(p.retrieve().compareTo(largest) > 0) largest = p.retrieve();
            p.advance();
        }
        return this.find(largest);
    }
    
    /**
     * This will insert the element x, just before the first element found which is greater than or equal to x.  
     * If the list is empty, you just need to insert x. 
     * Eg:
     * 10->8->25->80->8->50-> Say we insert 12. Then after the insertion, list
     * should look like the following 10->8->12->25->80->8->50->
     *
     * @param x is the element
     */
    
    public void insertBeforeFirstLargest(AnyType x) {
        LinkedListIterator<AnyType> p = first();
        while(p.retrieve().compareTo(x) <= 0){
            p.advance();
        }
        LinkedListIterator<AnyType> anotherP = this.findPrevious(p.retrieve());
        anotherP.current.next = new ListNode(x, p.current);
    }
    
    /**
     * Simple print method
     *
     */
    public void printList() {
        if (isEmpty()) {
            System.out.print("Empty list");
        } else {
            LinkedListIterator<AnyType> itr = first();
            for (; itr.isValid(); itr.advance()) {
                System.out.print(itr.retrieve() + "->");
            }
        }
        System.out.println();
    }

    /**
     * Return the list size
     *
     * @return the number of elements of the list
     */
    public int listSize() {
        LinkedListIterator<AnyType> itr;
        int size = 0;

        for (itr = first(); itr.isValid(); itr.advance()) {
            size++;
        }

        return size;
    }
}
