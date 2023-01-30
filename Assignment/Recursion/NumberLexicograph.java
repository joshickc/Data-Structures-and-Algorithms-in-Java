package Recursion;
import java.util.*;
public class NumberLexicograph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <String> list = new ArrayList<>();
        Solve(n,list);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        sc.close();
    }

    private static void Solve(int n, ArrayList<String> list) {
        if (n<0) {
            return;
        }
        String s=""+n;
        list.add(s);
        Solve(n-1, list);

    }
}
