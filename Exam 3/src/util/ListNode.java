package util;

// Basic node stored in a linked list
// Note that this class is not accessible outside
// of the package
class ListNode<AnyType extends Comparable<? super AnyType>> {

    public AnyType element;
    public ListNode<AnyType> next;

    // Constructors
    public ListNode(AnyType theElement) {
        this(theElement, null);
    }

    public ListNode(AnyType theElement, ListNode<AnyType> n) {
        element = theElement;
        next = n;
    }
}
