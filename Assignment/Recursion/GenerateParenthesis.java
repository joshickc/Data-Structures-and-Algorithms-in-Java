package Recursion;
import java.util.*;
public class GenerateParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solve(n,"",0,0);
        sc.close();
    }

    private static void Solve(int n, String string,int countopen, int countclose) {
        if (countopen+countclose==2*n) {
            System.out.println(string);
        }
        
        if (countclose<countopen) {
            Solve(n, string+")", countopen, countclose+1);
            
        }
        if (countopen<n) {
            Solve(n, string+"(", countopen+1, countclose);
        }

       
    }
}
