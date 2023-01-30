package Recursion;
import java.util.*;
//import java.io.*;
public class Obedient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        boolean b= Solve(s);
        System.out.print(b);
        sc.close();
    }

    private static boolean Solve(String s) {
        if (s.length()==0) {
            return true;
        }
        if (s.charAt(0)=='a') {
            if (s.length()==1) {
                return true;
            }
            if (s.charAt(1)=='a') {
                return Solve(s.substring(1));
            }
            else if(s.length()>=3 &&s.charAt(1)=='b'&&s.charAt(2)=='b'){
                return Solve(s.substring(3));
                
            }else{
                return false;
            }
        }
            
        return false;
        
        
    }
}
