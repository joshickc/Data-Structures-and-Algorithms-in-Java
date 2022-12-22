package FirstClass;

import java.util.Scanner;

public class Prime2 {
    public static void main(String [] args) {
        int a =0;
        int b=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0)
        System.out.println("Invalid Input");
        else if(n==1)
        System.out.println(a);
        else if(n==2)
        System.out.println(b);
         int c=a+b;
        for (int i = 3; i <= n; i++) {
        c=a+b;
        a=b;
        b=c;   
        }
        if(n>=3)
        System.out.println(c);
       sc.close(); 
    }
    
}
