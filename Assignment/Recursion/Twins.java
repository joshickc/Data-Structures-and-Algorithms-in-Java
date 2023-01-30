package Recursion;
import java.util.*;
//import java.io.*;
public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        System.out.print(Solve(s, 0));
        sc.close();
       
    }

    private static int Solve(String s, int a) {
        if(s.length()<3){
            return a;
        }

        if (s.length()>=3 && s.charAt(0)==s.charAt(2)) {
            a++;
        }
        return Solve(s.substring(1), a);

    }
}
