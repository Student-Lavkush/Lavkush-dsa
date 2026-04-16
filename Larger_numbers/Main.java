package Larger_numbers;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int a=30;
        int b =67;
        //in Biginteger we cannot use new keyword necoz it is static
        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(23);//converting int/long into BI
        BigInteger C = new BigInteger("39383848934898");
        int  c= B.intValue();//converting BI into int.
      BigInteger D = BigInteger.TEN;

      //for addition
      BigInteger E = A.add(B);
      System.out.println(E);
      System.out.println(D);
      //C-B<  0
      if(C.compareTo(B)<0){
        System.out.println("yes");
      }
      else{
        System.out.println("no");
      }
      System.out.println(Factorial.fact(234));
      
    }
}
