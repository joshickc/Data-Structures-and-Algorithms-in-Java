package Recursion;
import java.util.*;
public class SplitArray {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a=new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        String s1="";
        String s2="";
        Solve(a,0,0,0,s1,s2);
        System.out.println(count);
        sc.close();
    }
    

    private static void Solve(int[] a, int i, int sum1, int sum2,String s1, String s2) {
        if(i==a.length){
            if (sum1==sum2) {
                System.out.println(s1+" and "+s2);
                count++;
            }
            return;
        }
        Solve(a, i+1, sum1+a[i], sum2, s1+a[i]+" ", s2);
        Solve(a, i+1, sum1, sum2+a[i], s1, s2+a[i]+" ");
    }    
}
