package Question02;

import java.util.Arrays;
import java.util.ArrayList;

public class Question02 {
  
  public static void main(String[] args){
    int limit = Integer.parseInt(args[0]);

    boolean[] primes = new boolean[limit];
    Arrays.fill(primes, true);
    primes[0] = false;
    primes[1] = false;
    System.out.println("HERE");
    for( int i = 2; i < primes.length; i++ ){
      
      if(primes[i]){
        int[] multiples = getmultiples(i, limit);
        
        for (int j : multiples){
          primes[j] = false;
        }

      }

    }
    for(int i = primes.length - 1; i >= 0; i--){
      if (primes[i]) System.out.print(i + ", ");
    }
  }


  public static int[] getmultiples(int num, int limit){
    ArrayList<Integer> multiples = new ArrayList<Integer>(0);
    for(int i = 2; i < limit; i++){
      int multiple = i * num;
      if(multiple >= limit) {
        break;
      }
      multiples.add(multiple);
    }
        return multiples.stream().mapToInt(Integer::intValue).toArray();
  }
}
