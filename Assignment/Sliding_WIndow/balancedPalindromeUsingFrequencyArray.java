package Sliding_WIndow;
import java.util.*;
//import java.io.*;
public class balancedPalindromeUsingFrequencyArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int []a=new int [n];
    for (int i = 0; i < a.length; i++) {
        a[i]=sc.nextInt();
    }
    int max_sum=k+k;
    int [] freq= new int [max_sum+1];

    for (int i = 0; i <n/2; i++) {
        int sum =a[i]+a[n-1-i];
        freq[sum]++;   
    }
    int maxf=0;
    for (int i = 0; i < freq.length; i++) {
        maxf=Math.max(maxf, freq[i]);
    }
    int ans=n/2-maxf;
    System.out.println(ans);




    sc.close();
  }  
}
