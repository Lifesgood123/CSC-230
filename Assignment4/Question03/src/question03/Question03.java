package question03;

import java.util.function.IntFunction;

/**
 *
 * @author ellie
 */
public class Question03 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(recursiveReverseInt(123456789, 0, 0));
    }
    
    /**
     * @param num
     * @param pos
     * @param length
     * @return
     *
     * This function uses errors to anchor the recursion, I'm not claiming this
     * is good, but I checked with CA and I have the email to prove it
     */
    public static int recursiveReverseInt(int num, int pos, int length){
        IntFunction f = (x) -> (int)((x % Math.pow(10, pos + 1)/Math.pow(10, pos))) * (int)Math.pow(10, length - pos - 1);
        try {
            int neverRead = 1/length;
        } catch(ArithmeticException e) {
            return recursiveReverseInt(num, pos, (int)Math.ceil(Math.log10(num)));
        }
        try {
            int tmp = 1/(pos - length >> 31 & 1);
        } catch (ArithmeticException e){
            return (int)f.apply(num);
        }
        return (int)f.apply(num) + recursiveReverseInt(num, pos + 1, length);
    }   
}
