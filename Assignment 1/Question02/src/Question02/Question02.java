package Question02;

import java.util.Arrays;
import java.util.ArrayList;

public class Question02 {
  public static void main(String[] args){
    // Take in single postional argument limit
    int limit = Integer.parseInt(args[0]);
    int[] primes = getPrimes(limit);
    for( int i : primes ){
      System.out.print(i + ", ");
    }
  }
  /**
   * Calculates all primes to a non-inclusive limit
   * @param limit - Upper limit of primes
   * @return int[] of prime numbers 
   */
  public static int[] getPrimes(int limit){
    ArrayList<Integer> primeList = new ArrayList<Integer>(0);
    boolean[] primes = new boolean[limit];
    Arrays.fill(primes, true);
    primes[0] = false;
    primes[1] = false;
    for( int i = 2; i < primes.length; i++ ){
      if(primes[i]){
        ArrayList<Integer> multiples = getmultiples(i, limit);
        for (int j : multiples){
          primes[j] = false;
        }
      }
    }
    for(int i = primes.length - 1; i >= 0; i--){
      if (primes[i]) primeList.add(i);
    }
    return primeList.stream().mapToInt(Integer::intValue).toArray();
  }

 /**
  * Returns all multiples of a given number
  * @param num Integer to return multiples of
  * @param limit upper bound of multiples non-inclusive,
  * @return ArrayList<Integer> of multiples of num
  */
  public static ArrayList<Integer> getmultiples(int num, int limit){
    ArrayList<Integer> multiples = new ArrayList<Integer>(0);
    for(int i = 2; i < limit; i++){
      int multiple = i * num;
      if(multiple >= limit) {
        break;
      }
      multiples.add(multiple);
    }
        return multiples;
  }
}
