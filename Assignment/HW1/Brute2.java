package HW1;

import java.util.Scanner;

public class Brute2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        int q = sc.nextInt();
        while (q>0) {
            q--;
            int l =sc.nextInt();
            int r= sc.nextInt();
            int z = sc.nextInt();

            for (int i = l; i <=r; i++) {
                arr[i]+=z;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
               System.out.println(); 
        }
        sc.close();
    }

}