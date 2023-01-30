package Recursion;
import java.util.*;
//import java.io.*;
public class Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        System.out.println("\n"+PrintSubsequence(s,""));
        sc.close();
    }

    public static int PrintSubsequence(String s, String string) {
        if (s.length()==0) {
            System.out.print(string+" ");
            return 1;
        }
        char ch =s.charAt(0);
        int f1=PrintSubsequence(s.substring(1), string);
        int f2=PrintSubsequence(s.substring(1), string+ch);
        return f1+f2;
    }

}
