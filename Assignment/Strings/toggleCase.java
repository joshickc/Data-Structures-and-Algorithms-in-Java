package Strings;
import java.util.*;
//import java.io.*;

public class toggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        String res="";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch>=97&&ch<=122) {
                ch=(char) (ch-32);
                res+=ch;
            }else{
                ch=(char) (ch+32);
                
                res+=ch;
            }
        }
        System.out.println(res);




        sc.close();
    }
}
