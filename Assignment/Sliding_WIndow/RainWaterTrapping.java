package Sliding_WIndow;
import java.util.*;
public class RainWaterTrapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n =sc.nextInt();
            int []a= new int [n];
            for (int i = 0; i < a.length; i++) {
                a[i]=sc.nextInt();
            }
            int[]lmax= new int [n];
            int []rmax=new int [n];
            int []min = new int [n];
            lmax[0]=a[0];
            for (int i = 1; i < a.length; i++) {
                lmax[i]=Math.max(lmax[i-1], a[i]);
            }
            rmax[n-1]=a[n-1];
            for (int i = n-2; i >=0; i--) {
                rmax[i]=Math.max(rmax[i+1], a[i]);
            }
            for (int i = 0; i < min.length; i++) {
                min[i]=Math.min(lmax[i], rmax[i]);
            }
            long ans=0;
            for (int i = 0; i < min.length; i++) {
              ans=ans+(min[i]-a[i]);  
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
