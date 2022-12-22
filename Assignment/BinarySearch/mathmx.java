package BinarySearch;
import java.util.*;
//import java.io.*;
public class mathmx {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-->0) {
        int p = sc.nextInt();
        int q = sc.nextInt(); 
        int lo=1;
        int hi=89;
        double ans=0.0;
        while (lo<=hi) {
            int mid=lo+(hi-lo)/2;
            if ((Math.PI*Math.PI/4+p*Math.PI/2+q)/mid<=(Math.PI*Math.PI/4+p*Math.PI/2+q)/(mid+1)) {

                ans=mid+1;
                lo=mid-1;
            }
            else{
                hi=mid+1;;
            }
            
        }
        System.out.println(ans);
    }
   
    
sc.close();
   } 
}
