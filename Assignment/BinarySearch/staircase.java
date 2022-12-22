package BinarySearch;
import java.util.*;
//import java.io.*;
public class staircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long hi= (long) (Math.pow(2, 20));
        long lo=0;
        long ans=-1;
        while (lo<=hi) {
            long mid= lo+(hi-lo)/2;
            if (mid*(mid+1)/2<=n) {
                ans=mid;
                lo=mid+1;
            } else {
                hi=mid-1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
