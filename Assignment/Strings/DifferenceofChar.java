package Strings;

import java.util.Scanner;

public class DifferenceofChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        String ans="";
        for (int i = 0; i < s.length()-1; i++) {
            char ch=s.charAt(i);
            char ch2=s.charAt(i+1);
            int n =ch2-ch;
            String f = Integer.toString(n);
            ans=ans+ch+f;
            
        }
        ans+=s.charAt(s.length()-1);
        System.out.println(ans);




        sc.close();
    }
}
