package Strings;

import java.util.Scanner;

public class oddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res="";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(i%2==0)
            ch+=1;
            else
            ch-=1;

            res=res+ch;
        }
        System.out.println(res);
        sc.close();
    }

}