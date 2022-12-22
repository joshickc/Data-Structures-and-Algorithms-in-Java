package Strings;
import java.util.*;
//import java.io.*;
public class Biggest_Integger {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-->0) {
        int n=sc.nextInt();
        int []a= new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        Bubblesort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    sc.close();
  }

private static void Bubblesort(int[] a) {
    int flag = 0;
    int n=a.length;
    //bubble sort
    for (int i = 0; i < n; i++) {
        flag=0;
        for (int j = 0; j < n-i-1; j++) {
            if (compare(a[j],a[j+1])>0) 
            {
                int temp = a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                flag=1;
            } 
            
        }
        if (flag==0) {
            break;
        }
    }

}

private static int compare(int i, int j) {
    String s1=""+i+j;
    String s2=""+j+i;
    if (Long.parseLong(s2)>Long.parseLong(s1)) {
        return 1;
    } else {
        return -1;
    }
   // return 0;
}  
}
