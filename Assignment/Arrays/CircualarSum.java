package Arrays;
import java.util.*;
public class CircualarSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op= sc.nextInt();
        while (op-->0) {
        int n = sc.nextInt();
        int []a=new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
            
        }
        int max=0;
        for (int i = 0; i < a.length; i++) {
            int sum=0;
            
            for (int j = i; j <n+i; j++) {
                sum+=a[i];
                max=Math.max(max, sum);
                
            }
        }
        System.out.println();
        }
        
       
        sc.close();
    }
}
