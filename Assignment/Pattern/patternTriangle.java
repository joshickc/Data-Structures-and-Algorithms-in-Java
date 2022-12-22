package Pattern;

import java.util.Scanner;

public class patternTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int num=1;
        int space=1;
        for (int i = 0; i < n; i++) {
            System.out.print("*"+" ");
        }
        System.out.println();
        for (int i = 0; i <n/2; i++) {

            for (int j = i; j < n/2; j++) {
                System.out.print("*"+" ");
            }
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            space+=2;
            for (int j = i; j < n/2; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        space-=4;
        for (int i = 2; i<=n/2; i--) {

            for (int j =0; j < i; j++) {
                System.out.print("*"+" ");
            }
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            space-=2;
            for (int j = 0; j < i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*"+" ");
        }
        sc.close();
    }
}
