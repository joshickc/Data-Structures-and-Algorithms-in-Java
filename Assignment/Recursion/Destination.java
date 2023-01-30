package Recursion;
import java.util.*;
//import java.io.*;
public class Destination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("\n"+Jumps(n,""));
        sc.close();
    }

    public static int Jumps(int n, String string) {
        if (n==0) {
            System.out.println(string);
            return 1;
        }
        if (n<0) {
            return 0;
        }
        int j1=Jumps(n-1, string+1);
        int j2=Jumps(n-2, string+2);
        int j3=Jumps(n-3, string+3);

    
    return j1+j2+j3;
    }
}
