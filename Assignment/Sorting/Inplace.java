package Sorting;

import java.util.Scanner;

public class Inplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];

         for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
         }

         int p1=0; // pointer of 1 pposition
         for (int i = 0; i < a.length; i++) {
            if(a[i]==0)
            {
            a[i]=a[p1];
            a[p1]=0;
            p1++;
            }
         }

         for ( int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
         }


         sc.close();

    }
}