package bigrational;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This is a test class to test BigRational class
 */
public class BigRationalTest {

    public static void main(String[] args) {
        BigRational br1 = new BigRational(BigInteger.ONE, BigInteger.TEN);
        System.out.println(br1.toString());
        
        BigRational br2 = new BigRational("1/0");
        System.out.println(br2.toString());
        
        BigRational br3 = new BigRational("-1/0");
        System.out.println(br3.toString());
        
        BigRational result = (new BigRational("2/10")).multiply(new BigRational("2/5"));
        System.out.println(result.toString());

        System.out.println("-----------------------------");
        System.out.println("Sort Test\n");
        
        ArrayList<BigRational> a = new ArrayList<>();

        a.add(new BigRational("1/3"));
        a.add(new BigRational("1/5"));
        a.add(new BigRational("1/8"));
        a.add(new BigRational("2/8"));
        a.add(new BigRational("3/8"));
        a.add(new BigRational("-1/0")); // negative infinity
        a.add(new BigRational("+1/0")); // positive infinity

        Collections.sort(a);

        for (BigRational br : a) {
            System.out.println(br.toString());
        }
        System.out.println(new BigRational(0, 0));
        
        System.out.println("Exception Test");
        
        try{
            new BigRational(2, 3).toBigInteger();
        } catch(ArithmeticException e){
            System.out.println(e);
        }
        try{
            new BigRational(2, 3).toInteger();
        } catch(ArithmeticException e){
            System.out.println(e);
        }


    }
        
}
