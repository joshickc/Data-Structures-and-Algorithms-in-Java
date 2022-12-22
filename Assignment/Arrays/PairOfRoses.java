package Arrays;
import java.util.*;
//import java.io.*;
public class PairOfRoses {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-->0) {
        int n=sc.nextInt();
        int []p=new int [n];
        for (int i = 0; i < p.length; i++) {
            p[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        Arrays.sort(p);
        int min = p[n-1]-p[0];
        int a1=p[0];
        int a2=p[n-1];
        for (int i = 0; i < p.length; i++) {
            for (int j = i+1; j < p.length; j++) {
                if (m==(p[i]+p[j])) {
                    int diff =p[j]-p[i];
                    if(diff<min){
                        min=diff;
                        a1=p[i];
                        a2=p[j];
                    }

                }
            }
        }
        System.out.println("Deepak should buy roses whose prices are "+ a1+" and "+a2+".");
        System.out.println();

    }
    sc.close();
   } 
}
