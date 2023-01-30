package Recursion;
import java.util.*;
public class StringCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList <String> list = new ArrayList<>();
        Solve(s,list,"");
        System.out.println(list);
        sc.close();
    }

    private static void Solve(String s, ArrayList<String> list, String ans) {
        if (s.length()==0) {
            list.add(ans);
            return;
        }
        
        String su = s.substring(0,1);
        int a= Integer.parseInt(su);
        if (a!=0) {
            char ch =(char)(a+96);
            Solve(s.substring(1), list, ans+ch); 
        }
       

        if (s.length()>=2) {
            String sub = s.substring(0,2);
            int n= Integer.parseInt(sub);
            
            if (n<=26) {
                char c =(char)(n+96);
                Solve(s.substring(2), list, ans+c);
            }
            
            
        }
       


    }
}