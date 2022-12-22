package BinarySearch;
import java.util.*;
public class minimumRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long []a = new long [(int) n];
        for (long i = 0; i < a.length; i++) {
            a[(int) i]=sc.nextLong();
        }
        long lo=0;
        long hi=n-1;
        long ans=0;
        while (lo<=hi) {
            long mid = lo+(hi-lo)/2;
            if (a[(int)mid]<=a[(int)n-1]) {
                ans=mid;
                hi=mid-1;

            } else {
                lo=mid+1;
                
            }
            
        }
        System.out.println(a[(int)ans]);
        sc.close();
    }
}
