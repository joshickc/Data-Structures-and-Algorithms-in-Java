package FirstClass;

import java.util.Scanner;

public class DigitSum {
    public static void main(String [] args){
        int a,c=0;
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for (int i = n; i >0; i/=10) {
            a = i%10;  
            c+=a;
            System.out.print(a+" ");
        }
       System.out.println(c);
       sc.close();
    }
}
