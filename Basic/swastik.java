package Basic;

import java.util.Scanner;

public class swastik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n/2; i++) {
            System.out.print("*");

            for (int j = 1; j < n/2 ; j++) {
                System.out.print(" ");
            }
            if(i==0){
                for (int j = 0; j <=n/2; j++) {
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int j = 0; j <=n; j++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < n/2; i++) {
            if (i<n/2-1) {
                for (int j2 = 0; j2 < n/2; j2++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else {
                for (int j = 0; j <=n/2; j++) {
                    System.out.print("*");
                }
            }
            for (int j2 = 1; j2 < n/2; j2++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}
