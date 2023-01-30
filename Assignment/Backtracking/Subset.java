package Backtracking;
//Given an integer array nums of unique elements, return all possible 
//subsets (the power set)
import java.util.*;
public class Subset {
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
       Collections.sort(list,compare);
       for (int i = 0; i < list.size(); i++) {
            for (int j : list.get(i)) {
                System.out.print(j+" ");
            }
            System.out.println();
        
       }
       sc.close();
    }

    private static void Solve(int[] a, int i, List<List<Integer>> list, ArrayList<Integer> l) {
        if (i==a.length) {
            list.add(new ArrayList<>(l));
            return;
        }
        Solve(a, i+1, list, l);
        l.add(a[i]);
        Solve(a, i+1, list, l);
        l.remove(l.size()-1);
        
    }
    static Comparator<List<Integer>> compare= new Comparator<List<Integer>>() {
        @Override
        public int compare(List<Integer> o1, List<Integer> o2) {
            for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
                if (o1.get(i) != o2.get(i)) {
                    return o1.get(i) - o2.get(i);
                }
            }
            return o1.size() - o2.size();
        }
    };
}
