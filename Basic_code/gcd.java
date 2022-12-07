package Question;

import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = HCf(a, b);
        System.out.println(gcd);
        sc.close();
    }
    public static int HCf(int a, int b) 
    {
        int gcd=a;
        int rem=1;
        while(b%gcd!=0){
            rem = b%gcd;
            b=gcd;
            gcd=rem;
        }   
        return gcd;
    }
}
