package Arrays;
import java.util.*;
public class CircularBackwards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[]a= new long[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextLong();
        }
        int op =sc.nextInt();
        
        while (op-->0) {
            int id=sc.nextInt();
            long [] b = new long[n];
            for (int i = 0; i < a.length; i++) {
                b[i]=a[i]+a[(i-id+n)%n];
            }
            a=b;
            
        }
        long sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=(sum+a[i]);
            sum=(long) (sum%(1e9+7));
            
        }
        System.out.println(sum);
        sc.close();
    }
}
