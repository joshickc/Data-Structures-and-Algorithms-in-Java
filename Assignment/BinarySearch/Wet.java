package BinarySearch;
import java.util.*;
//import java.io.*;
public class Wet {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] a = new int [n];
    for (int i = 0; i < a.length; i++) {
        a[i]=sc.nextInt();
    }
   // int lo=0;
    //int hi=n-1;
    int min =Integer.MAX_VALUE;
     for (int i = 0; i < a.length; i++) {
        if(a[i]<min)
         min=a[i];
    }
    
    System.out.println(min);
    sc.close();
  }  
}
