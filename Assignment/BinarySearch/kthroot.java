package BinarySearch;

import java.util.Scanner;
public class kthroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            long n=sc.nextLong();
            long k=sc.nextLong();
            long ans=0;
            long lo=0;
            long hi=n;
            while (lo<=hi) {
                long mid=lo+(hi-lo)/2;
                if(k*Math.log10(mid)<=Math.log10(n)){
                    ans=mid;
                    lo=mid+1;
                }else{
                    hi=mid-1;
                }
            }
            System.out.println(ans);


        }



        sc.close();
    }
}
