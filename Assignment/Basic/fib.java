
package Basic;

import java.math.BigInteger;
import java.util.*;


public class fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
         //int count=0;
         
		 BigInteger a = new BigInteger("0");
		 BigInteger b = new BigInteger("1");
		 BigInteger c = new BigInteger("1");
		 
		 
         if (n>=1) {
            System.out.println(a+" ");  
         } 
         if(n>=2){
            System.out.println(b+" "+ c);
         }
         
        for (int i = 3; i <=n; i++) {
                for (int j = 1; j <=i; j++) {
					a=b;
					b=c;
                    c=a.add(b);
                    System.out.print(c+" ");
                    
                }
                System.out.println();
        }

        sc.close();
    }
}