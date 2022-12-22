package BinarySearch;

import java.util.Scanner;

public class DivisiblebyK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            long []a= new long [n];
            for (int j = 0; j < a.length; j++) {
                a[i]=sc.nextInt();
            }
            long []prefix_sum= new long [n+1];
            prefix_sum[0]=0;
            for (int j = 0; j < a.length; j++) {
                prefix_sum[j+1]=(prefix_sum[j]%n+a[j]%n)%n;
                if (prefix_sum[j+1]<0) 
                {
                    prefix_sum[j+1]+=n;
                    
                }
            }
            int [] freq= new int [n];

            for (int j = 0; j < prefix_sum.length; j++) {
                freq[(int)prefix_sum[j]]++;
            }
            int ans=0;
            for (int j = 0; j < freq.length; j++) {
                if (freq[j]>=2) {
                    ans=ans+freq[j]*(freq[j]-1)/2;
                }
              

            }
            System.out.println(ans);
        }
        sc.close();
    }
}
