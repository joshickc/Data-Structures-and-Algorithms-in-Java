package Recursion;
import java.util.*;
//import java.io.*;
public class HeadTail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n =sc.nextInt();
        System.out.println("\n"+PrintHeadTail(n,""));
        sc.close();
    }

    public static int PrintHeadTail(int n, String string) {
        if (n==0) {
            System.out.print(string+" ");
            return 1;
        }
        int f1=0;
        if (string.length()==0||string.charAt(string.length()-1)!='H')
        f1= PrintHeadTail(n-1, string+'H');

        int f2=PrintHeadTail(n-1, string+"T");
        return f1+f2;
    }
}
  