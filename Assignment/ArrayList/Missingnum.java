package ArrayList;
import java.util.*;
//import java.io.*;
public class Missingnum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int []a= new int [n];
    for (int i = 0; i < a.length; i++) {
        a[i]=sc.nextInt();
    }
    ArrayList <Integer> list = new ArrayList<>();
    int []freq= new int [n+1];
   for (int i = 0; i < a.length; i++) {
    freq[a[i]]++;
   }
   for (int i = 1; i < freq.length; i++) {
     if (freq[i]==0) {
        list.add(i);
     }
   }
   System.out.println(list);


    sc.close();
  }  
}
