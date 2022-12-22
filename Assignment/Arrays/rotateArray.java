package Arrays;

import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [][] a = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=sc.nextInt();
            }
            
            
        }
        int [][] res = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[(n-1-j)%n][i]=a[i][j];
            }
            
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j]+" ");;
            }
            
            System.out.println();
        }
        sc.close();

    }
}
