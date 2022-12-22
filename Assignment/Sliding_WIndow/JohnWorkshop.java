//Same as book problem on code forces
package Sliding_WIndow;
import java.util.*;
//import java.io.*;
public class JohnWorkshop {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int []a= new int [n];
    for (int i = 0; i < a.length; i++) {
        a[i]=sc.nextInt();
    }
    int count=0;
    long sum =0;
    int pos =0;
        for (int i = 0; i < a.length; i++) 
        {
           sum+=a[i];
           count++;
            if (sum>t) 
            {
                sum-=a[pos];
                pos++;
                count--;
            }
            
        }
    System.out.println(count);
 
    
    sc.close(); 



   
 }   
}
