package Recursion;
import java.util.*;
public class Coin {
    static long count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target=sc.nextInt();
        int []a=new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        Solve(a,0,target);
        System.out.println(count);
        sc.close();

    }
    private static void Solve(int[] a, int i, int target) {
        if (target==0) {
            count++;
            return;
        }
        for (int j = i; j < a.length; j++) {
            if (a[j]<=target) {
                Solve(a, j, target-a[j]);
            }
            
        }
    }
}
