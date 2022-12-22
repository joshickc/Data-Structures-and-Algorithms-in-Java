package HW1;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
       // int num = 1;
        int count =1;
        for (int i = 1; i <=n; i++) {
           
            for (int k = 1; k <=count; k++) {
                System.out.print(k);
            }
            
            for (int j = count; j < n; j++) {
                    System.out.print("*");
                
            }
            count++;
            
            System.out.println();
        }
        sc.close();
    }
}