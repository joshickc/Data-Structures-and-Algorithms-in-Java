package Arrays;
import java.util.*;
public class magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long rem=0;
        long ans=0;
        long temp=n;
        
        int count=0;
        while (temp>0) {
            rem=temp%10;
            count++;
            temp=temp/10;  
        }
        long []a = new long [count];
        count=0;
        temp=n;
        while (temp>0) {
            rem=temp%10;
            a[count]=rem;
            count++;
            temp/=10;
        }

        for (int i = 0; i < a.length; i++) {
            if (i!=a.length-1) {
                a[i]=a[i]>4?9-a[i]:a[i];
            } else {
                a[i]=a[i]>4?(9-a[i])>0?9-a[i]:a[i]:a[i];            }
        }
        for (int index = a.length-1; index >=0; index--) {
            ans=ans*10+a[index];
        }
        System.out.println(ans);
       sc.close();
    }
}
