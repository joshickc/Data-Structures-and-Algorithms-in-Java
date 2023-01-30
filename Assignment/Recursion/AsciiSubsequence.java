package Recursion;
import java.util.*;
public class AsciiSubsequence {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        Solve(s,"");
        System.out.println();
        System.out.println(count);
        sc.close();
    }
    private static void Solve(String s, String str) {
        if (s.length()==0) {
            System.out.print(str+" ");
            count++;
            return;
        }
        char ch=s.charAt(0);
        Solve(s.substring(1), str);
        Solve(s.substring(1), str+ch);
        Solve(s.substring(1), str+(int)ch);

    }
}
