package FirstClass;

import java.util.Scanner;

public class Prime {
    public static void main(String [] args) {

     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int flag=0;
     for (int i = 2; i < n; i++) 
     {
        if(n%i==0)
        {
        System.out.println("Not Prime");
        flag=1;
        break;
        }
     }
     if(flag==0)
     System.out.println("Prime");
     sc.close();
    }
}
