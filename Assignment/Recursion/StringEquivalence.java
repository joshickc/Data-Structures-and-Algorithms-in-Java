package Recursion;

import java.util.*;

public class StringEquivalence {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Solve(n,"",'a');

       
      sc.close();
    }
    public static void Solve(int n, String s,char max){
        if (s.length()==n) {
            System.out.println(s);
            return;
        }
        
        for (char j = 'a'; j <= max; j++) {
            if (j==max) {
                Solve(n, s+j, (char) (max+1));
            }else{
                Solve(n, s+j, max);
            }
           
        }
    }


}
