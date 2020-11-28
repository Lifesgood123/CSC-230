package findsecondminimumtest;

import java.util.Arrays;
import java.util.TreeSet;

public class FindSecondMinimumTest {

    /**
     * Find the second minimum of an array
     *
     * @param <T>
     * @param a is the array
     * @return the second minimum if array has at least two elements and it
     * indeed has a second minimum. If array length is less than two, it throws
     * IllegalArgumentException. If there is no second minimum (e.g. if all
     * elements are the same there is no second minimum), method throws
     * NoSuchElementException.
     */
    
    /*
        
    */
   
    public static <T extends Comparable<T>> T findSecondMin(T[] a){
        if (a.length == 1) throw new IllegalArgumentException("too smol");
        TreeSet<T> set = new TreeSet<>(Arrays.asList(a));
        if (set.size() == 1) throw new IllegalArgumentException("Elemanet Equality");
        TreeSet<T> treeSet = new TreeSet<>();
        treeSet.addAll(set);
        treeSet.pollFirst();
        return treeSet.pollFirst();
    }
    

    public static void main(String[] args) {
        /*
        DO NOT CHANGE ANYTHING IN THE main METHOD!!!!!!!
        */
        
        // Check your generic method with array of circles

        System.out.println("Testing on array of cicles.....\n");
        Circle[] a1 = {new Circle(1), new Circle(3), new Circle(2), new Circle(1)}; // 2
        Circle[] a2 = {new Circle(1), new Circle(1), new Circle(1), new Circle(5)}; // 5
        Circle[] a3 = {new Circle(3), new Circle(6), new Circle(5), new Circle(8), new Circle(10), new Circle(20), new Circle(15)}; // 5
        Circle[] a4 = {new Circle(1), new Circle(1), new Circle(1)}; // Should throw NoSuchElementException exception
        Circle[] a5 = {new Circle(1)}; // Should throw IllegalArgumentException

        System.out.println(Arrays.toString(a1) + ": " + (findSecondMin(a1).equals(new Circle(2))));
        System.out.println(Arrays.toString(a2) + ": " + (findSecondMin(a2).equals(new Circle(5))));
        System.out.println(Arrays.toString(a3) + ": " + (findSecondMin(a3).equals(new Circle(5))));

        try {
            System.out.println(findSecondMin(a4));
        } catch (Exception e) {
            System.out.print(Arrays.toString(a4));
            System.out.println(e.toString());
        }

        try {
            System.out.println(findSecondMin(a5));
        } catch (Exception e) {
            System.out.print(Arrays.toString(a5));
            System.out.println(e.toString());
        }

        // Check your method with array of rectangles
        System.out.println("\nTesting on array of Rectangles.....\n");
        Rectangle[] b1 = {new Rectangle(1, 2), new Rectangle(3, 1), new Rectangle(2, 1), new Rectangle(1, 2)}; // (3, 1)
        Rectangle[] b2 = {new Rectangle(1, 5), new Rectangle(5, 1), new Rectangle(3, 3), new Rectangle(5, 10)}; // (5, 10)
        Rectangle[] b3 = {new Rectangle(3, 5), new Rectangle(6, 5), new Rectangle(5, 5), new Rectangle(8, 10), new Rectangle(10, 10)}; // (5, 5)
        Rectangle[] b4 = {new Rectangle(1, 1), new Rectangle(1, 1), new Rectangle(1, 1)}; // Should throw NoSuchElementException exception
        Rectangle[] b5 = {new Rectangle(1, 1)}; // Should throw IllegalArgumentException

        System.out.println(Arrays.toString(b1) + ": " + (findSecondMin(b1).equals(new Rectangle(3, 1))));
        System.out.println(Arrays.toString(b2) + ": " + (findSecondMin(b2).equals(new Rectangle(5, 10))));
        System.out.println(Arrays.toString(b3) + ": " + (findSecondMin(b3).equals(new Rectangle(5, 5))));

        try {
            System.out.println(findSecondMin(b4));
        } catch (Exception e) {
            System.out.print(Arrays.toString(b4));
            System.out.println(e.toString());
        }

        try {
            System.out.println(findSecondMin(b5));
        } catch (Exception e) {
            System.out.print(Arrays.toString(b5));
            System.out.println(e.toString());
        }
    }

}
/** Your output should be similar to the following.
 * **************************************************************************************************
Testing on array of cicles.....

[Circle{r=1}, Circle{r=3}, Circle{r=2}, Circle{r=1}]: true
[Circle{r=1}, Circle{r=1}, Circle{r=1}, Circle{r=5}]: true
[Circle{r=3}, Circle{r=6}, Circle{r=5}, Circle{r=8}, Circle{r=10}, Circle{r=20}, Circle{r=15}]: true
[Circle{r=1}, Circle{r=1}, Circle{r=1}]java.util.NoSuchElementException: This array has the same element. So, no second minimum
[Circle{r=1}]java.lang.IllegalArgumentException: Array needs to have at least two element

Testing on array of Rectangles.....

[Rectangle{length=1, width=2}, Rectangle{length=3, width=1}, Rectangle{length=2, width=1}, Rectangle{length=1, width=2}]: true
[Rectangle{length=1, width=5}, Rectangle{length=5, width=1}, Rectangle{length=3, width=3}, Rectangle{length=5, width=10}]: true
[Rectangle{length=3, width=5}, Rectangle{length=6, width=5}, Rectangle{length=5, width=5}, Rectangle{length=8, width=10}, Rectangle{length=10, width=10}]: true
[Rectangle{length=1, width=1}, Rectangle{length=1, width=1}, Rectangle{length=1, width=1}]java.util.NoSuchElementException: This array has the same element. So, no second minimum
[Rectangle{length=1, width=1}]java.lang.IllegalArgumentException: Array needs to have at least two element
 */
