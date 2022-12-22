package Arrays;
import java.util.*;
//import java.io.*;
public class MentalMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a= new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int ans=Integer.MIN_VALUE;
        
        Arrays.sort(a);
        int p1=a[n-1]*a[n-2]*a[n-3];
        int p2=a[0]*a[1]*a[2];
        int p3=a[0]*a[1]*a[n-1];
        int max=Math.max(p1, p3);
        ans=Math.max(p2, max);



        System.out.println(ans);
        sc.close();
    }
}
