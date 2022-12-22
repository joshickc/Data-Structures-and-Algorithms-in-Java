package BinarySearch;
import java.util.*;
//import java.io.*;
public class familyGreatestlessthan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int []a=new int [n];
    int []b=new int [m];
    for (int i = 0; i < a.length; i++) {
        a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    for (int i = 0; i < b.length; i++) {
        b[i]=sc.nextInt();
    }
    for (int i = 0; i < b.length; i++) {
        int lo=0;
        int hi=n-1;
        int idx=-1;
        while (lo<=hi) {
            int mid=lo+(hi-lo)/2;
            if(a[mid]<b[i]){
                idx=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        System.out.print((idx+1)+" ");
    }
sc.close();
  }  
}
