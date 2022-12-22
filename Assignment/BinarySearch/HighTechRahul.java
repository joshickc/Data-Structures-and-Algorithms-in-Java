package BinarySearch;
import java.util.*;
//import java.io.*;
public class HighTechRahul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int []b =new int [n];
        for (int i = 0; i < b.length; i++) {
            b[i]=a[i];
        }
        Arrays.sort(b);

        int flag1=0,flag2=0;
        for (int i = 0; i < b.length; i++) {
            if (a[i]!=b[i]) {
                flag1=1;
            }
            if (a[i]!=b[n-1-i]) {
                flag2=1;
            }
        }
        if (flag1==0||flag2==0) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        sc.close();
    }
}
