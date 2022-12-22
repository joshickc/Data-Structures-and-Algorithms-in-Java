package Bitwise;

import java.util.Scanner;

public class xor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        int max=0;
        for (int i = n; i <=m; i++) {
            for (int j = i; j <=m; j++) {
                max=Math.max(max, i^j);
                
            }
            
        }
        System.out.println(max);
        sc.close();
    }
}
