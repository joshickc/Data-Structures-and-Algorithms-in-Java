package CodeForces;
import java.util.*;

public class Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();

        int [] b = new int [n];
        for (int i = 0; i < b.length; i++) {
            b[i]=sc.nextInt();
        }
        int count=0;
        long time =0;
        int pos =0;
        for (int i = 0; i < b.length; i++) {
           time+=b[i];
           count++;
            if (time>t) {
                time-=b[pos];
                pos++;
                count--;
            }
            
        }
        System.out.println(count);

        sc.close();
    }
}
