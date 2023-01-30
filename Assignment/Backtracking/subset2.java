package Backtracking;
import java.util.*;
public class subset2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i < a.length; i++) {
             a[i]=sc.nextInt();
        } 
        List <List <Integer>> list = new ArrayList<>();
        ArrayList <Integer> l = new ArrayList<>();
        Solve(a,0,list,l);
        System.out.println(list);
        sc.close();
     }
 
     private static void Solve(int[] a, int i, List<List<Integer>> list, ArrayList<Integer> l) {
         if (i==a.length) {
             list.add(new ArrayList<>(l));
             return;
         }
         int x=a[i];
         boolean flag=true;
         for (int j = i; j >0; j--) {
            if (x==a[j-1]) {
                flag=false;
            }
         }
        
        
         l.add(a[i]);
         Solve(a, i+1, list, l);
         l.remove(l.size()-1);
         if (flag==true) {
            Solve(a, i+1, list, l); 
            }
    }
}
