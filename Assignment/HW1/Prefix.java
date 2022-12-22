package HW1;

import java.util.Scanner;

public class Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        int [] prefix = new int [n+1];
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            prefix[i]=sum;
        }
        
        for (int i = 0; i < n; i++) {
           System.out.print(prefix[i]+ " "); 
        }
        System.out.println();

        int q = sc.nextInt();
        while (q>0) {
            q--;
            int l =sc.nextInt();
            int r =sc.nextInt();
            if(l>0)
            System.out.println(prefix[r]-prefix[l-1]);
            else
            System.out.println(prefix[r]);

        }
         

        sc.close();
    }
}
