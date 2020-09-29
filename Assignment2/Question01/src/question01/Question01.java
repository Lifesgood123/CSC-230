/*
 * Honestly I doubt this code will pass 
 * all needed test cases, but it's been
 * long week and I hope this works as intended.
 * Also I wrote this to operate on a 2D array 
 * with values ranging from 0-25, so any char[][]
 * test cases will need to be passed through charArrayConverter
 */
package question01;

/**
 *
 * @author ellie
 */
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ellie
 */
public class Question01 {

    /**
     * @param args the command line arguments 
     * args[0] = table width 
     * args[1] = table length
     */
    public static void main(String[] args) {
        int tableLength, tableWidth;
        int sequenceLength = 4;
        Random random = new Random();
        if (args.length == 0) {
            tableWidth = getInteractiveIntInput("Enter Table Width: ");
            tableLength = getInteractiveIntInput("Enter Table Length: ");

        } else {
            tableLength = Integer.parseInt(args[0]);
            tableWidth = Integer.parseInt(args[1]);
        }
        int[][] table = new int[tableLength][tableWidth];
        for (int[] i : table) {
            int[] tempRandomArray = random.ints(tableWidth, 0, 26).toArray();   
            System.arraycopy(tempRandomArray, 0, i, 0, tempRandomArray.length);
        }
        printArray(table);
       System.out.println(""
              + "Has Horizontal: " + (hasHorizontal(table, sequenceLength) ? "yes" : "no") 
               + "\nHas Vetical:    " + (hasVertical(table, sequenceLength) ? "yes" : "no")
                + "\nHas Diagonal:   " + (hasDiagonal(table, sequenceLength) ? "yes" : "no")
    );

    }
    /** 
     * @param a
     * @param sequenceLength
     * @return 
     */
    public static boolean hasHorizontal(int[][] a, int sequenceLength){
        return hasConsecutive(a, sequenceLength, 0, 1);
    }
    
    /**
     *
     * @param a
     * @param sequenceLength
     * @return
     */
    public static boolean hasVertical(int[][] a, int sequenceLength){
        return hasConsecutive(a, sequenceLength, 1, 0);
    }
    
    /**
     *
     * @param a
     * @param sequenceLength
     * @return
     */
    public static boolean hasDiagonal(int[][] a, int sequenceLength){
        return hasConsecutive(a, sequenceLength, 1, 1);
    }

    /**
     *
     * @param a
     * @param sequenceLength
     * @param rowDirection
     * @param columnDirection
     * @return
     */
    public static boolean hasConsecutive(int[][] a, int sequenceLength, int rowDirection, int columnDirection) {
        for (int i = 0; i < a.length - sequenceLength * columnDirection; i++) {
            for (int j = 0; j < a[i].length - sequenceLength; j++) {
                boolean aFlag = true;                
                for (int offset = 0; offset < sequenceLength; offset++) {
                    if (Math.floorMod(a[i + offset * columnDirection][j + offset * rowDirection] - a[i][j], 26) != offset) {
                        aFlag = false;
                        break;
                    }
                }
                if (aFlag) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     *
     * @param a
     */
    public static void printArray(int[][] a) {
        for (int[] a1 : a) {
            printArray(a1);
        }
    }

    /**
     *
     * @param a
     */
    public static void printArray(int[] a) {
        for (int j = 0; j < a.length; j++) {
            System.out.print((char)(a[j] + 'a') + ", ");
        }
        System.out.println();
    }

    /**
     *
     * @param prompt
     * @return
     */
    public static int getInteractiveIntInput(String prompt) {
        try {
            Scanner kb = new Scanner(System.in);
            System.out.print(prompt);
            return Integer.parseInt(kb.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Not a valid number");
            return getInteractiveIntInput(prompt);
        }
    }
    
    /**
     *
     * @param inputArray
     * @return
     */
    public static int[][] charArrayConverter(char[][] inputArray){
        int[][] _intArray = new int[inputArray.length][inputArray[0].length];
        for(int i = 0; i < inputArray.length; i++){
            for(int j = 0; j < inputArray[i].length; j++){
                _intArray[i][j] = (int)(inputArray[i][j] - 'a');
            }
        }
        return _intArray;
    }
   

}
