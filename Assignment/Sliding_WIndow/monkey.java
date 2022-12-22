package Sliding_WIndow;
import java.util.*;
//import java.io.*;
public class monkey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []a= new int [n];

        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 1; i<=m; i++) {
            a[n-1]--;
            a[0]++;
            Arrays.sort(a);
        }
        System.out.println(a[n-1]-a[0]);





        sc.close();
    } 
}
