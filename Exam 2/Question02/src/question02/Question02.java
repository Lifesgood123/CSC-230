package question02;

import java.util.Arrays;

/**
 *
 * @author Ellie
 */
public class Question02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try{
            test();
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    /**
     *
     * @throws Exception on test failure.
     */

    
    public static void test() throws Exception {
        Circle[][] insertionSort = {
            {new Circle(308), new Circle(11), new Circle(335), new Circle(215), new Circle(47), new Circle(96)},
            {new Circle(294), new Circle(11), new Circle(175), new Circle(317), new Circle(311), new Circle(152)},
            {new Circle(102), new Circle(68), new Circle(226), new Circle(249), new Circle(225), new Circle(311)},
            {new Circle(68), new Circle(357), new Circle(107), new Circle(50), new Circle(5), new Circle(2)},
            {new Circle(152), new Circle(87), new Circle(66), new Circle(269), new Circle(166), new Circle(41)},
            {new Circle(50), new Circle(320), new Circle(25), new Circle(392), new Circle(282), new Circle(151)},
            {new Circle(46), new Circle(129), new Circle(77), new Circle(205), new Circle(72), new Circle(61)},
            {new Circle(16), new Circle(279), new Circle(318), new Circle(130), new Circle(111), new Circle(227)},
            {new Circle(119), new Circle(64), new Circle(72), new Circle(180), new Circle(191), new Circle(126)},
            {new Circle(172), new Circle(212), new Circle(83), new Circle(174), new Circle(98), new Circle(274)}
        };
        
        Circle[][] systemSort = {
            {new Circle(308), new Circle(11), new Circle(335), new Circle(215), new Circle(47), new Circle(96)},
            {new Circle(294), new Circle(11), new Circle(175), new Circle(317), new Circle(311), new Circle(152)},
            {new Circle(102), new Circle(68), new Circle(226), new Circle(249), new Circle(225), new Circle(311)},
            {new Circle(68), new Circle(357), new Circle(107), new Circle(50), new Circle(5), new Circle(2)},
            {new Circle(152), new Circle(87), new Circle(66), new Circle(269), new Circle(166), new Circle(41)},
            {new Circle(50), new Circle(320), new Circle(25), new Circle(392), new Circle(282), new Circle(151)},
            {new Circle(46), new Circle(129), new Circle(77), new Circle(205), new Circle(72), new Circle(61)},
            {new Circle(16), new Circle(279), new Circle(318), new Circle(130), new Circle(111), new Circle(227)},
            {new Circle(119), new Circle(64), new Circle(72), new Circle(180), new Circle(191), new Circle(126)},
            {new Circle(172), new Circle(212), new Circle(83), new Circle(174), new Circle(98), new Circle(274)}
        };
        
        for(int i = 0; i < systemSort.length; i++){
            System.out.print(Arrays.toString(systemSort[i]) + " \n");
            Arrays.sort(systemSort[i]);
            insertionSort(insertionSort[i]);
            System.out.println(Arrays.toString(insertionSort[i]) + " : " + Arrays.toString(systemSort[i]));
            if(!Arrays.equals(systemSort[i], insertionSort[i])) throw new Exception("Broke on Line " + i);
        }
        
        
    }
    
    /**
     *
     * @param <T>
     * @param a is the array
     * @return a, but sorted. Well really it's a but a is sorted, so this could
     * be void if I really wanted but tbh I'm not really down for the modifications
     * I would need to make in test()
     */
    public static <T extends Comparable> T[] insertionSort(T[] a) {
        int i;
        for (int j = 1; j < a.length; j++) {
                T key = a[j];
                i = j - 1;
                while (i >= 0 && a[i].compareTo(key) > 0) {
                    a[i + 1] = a[i];
                    i = i - 1;
                }
                a[i + 1] = key;
        }
        return a;
    }
}
