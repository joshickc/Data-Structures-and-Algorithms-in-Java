package Backtracking;
import java.util.*;
public class MrSinhaCoins {
    static boolean b= false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[]=new int[t];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        Solve(a,0,0,0);
        System.out.println(b);
        sc.close();
    }

    private static void Solve(int[] a, int i, int sum1,int sum2) {
        if (i>=a.length) {
            if (sum1==sum2) {
                b=true;            
            }
            return;
        }
        Solve(a, i+1, sum1+a[i], sum2);
        Solve(a, i+1, sum1, sum2+a[i]);
       
    }
}
