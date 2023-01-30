package Backtracking;
import java.util.*;
public class SmarKeypad {
    static String []table= { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        Solve(s,"");
        sc.close();

    }
    private static void Solve(String s,String ans) {
            if(s.length()==0){System.out.println(ans);return;}
            char ch=s.charAt(0);
            int x=ch-'0';
            for (int j = 0; j < table[x].length(); j++) {
                Solve(s.substring(1),ans+table[x].charAt(j));
            }
        
    }
}

