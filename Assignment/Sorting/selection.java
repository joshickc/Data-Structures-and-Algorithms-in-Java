package Sorting;

import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int []a = new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }

        // selection sort

        for (int i = 0; i < a.length; i++) {
            int min_idx =i;
            for (int j = i+1; j < n; j++) {
                if (a[min_idx]>a[j]) {
                   min_idx=j;
                }
            }
            int temp = a[i];
            a[i]=a[min_idx];
            a[min_idx]=temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }
}
