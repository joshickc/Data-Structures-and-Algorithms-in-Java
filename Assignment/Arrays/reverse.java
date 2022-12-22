package Arrays;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }

        for (int i = 0, j = n-1; i < j; i++, j--) {
                int temp =a[i];
                a[i]=a[j];
                a[j]=temp;
            
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }



        sc.close();
    }
}
