package Recursion;
import java.util.*;
public class TowerOfHanoi {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solve(n,"T1","T2","T3");
        System.out.println(count);
        sc.close();
    }
    private static void Solve(int n, String s, String d, String h) {
        //s source, h destination, d helper tower
        if (n<=0) {
            return;
        }
        Solve(n-1, s, h, d);
        System.out.println("Move "+n+"th"+ " disc from " +s+" to " +d);
        count++;
        Solve(n-2, h, s, d);
        if (n-1>0) {
            System.out.println("Move "+(n-1)+"th"+ " disc from " +h+" to " +d);
            count++;

        }
    }
}
