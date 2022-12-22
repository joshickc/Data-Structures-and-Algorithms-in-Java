package Basic;

import java.util.Scanner;

public class milli {
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int space=-1;
    for (int i = 0; i <n; i++) {
        for (int j = n; j >i ; j--) {
            System.out.print("*");
        }
        for (int j = space; j >0 ; j--) {
            System.out.print(" ");
        }
        
        if(space==-1){
            for (int j = n-1; j >i ; j--) {
                System.out.print("*");
            }
        }
        else
        {
            for (int j = n; j >i ; j--) {
                System.out.print("*");
            }
            
        }
        space+=2;
        System.out.println();
    }
    space-=4;
    for (int i = 2; i <=n; i++) {
        for (int j = i; j >0 ; j--) {
            System.out.print("*");
        }
        for (int j = space; j >0 ; j--) {
            System.out.print(" ");
        }
        
        if(space==-1){
            for (int j = n-1; j >0 ; j--) {
                System.out.print("*");
            }
        }
        else
        {
            for (int j = i; j >0 ; j--) {
                System.out.print("*");
            }
            
        }
        space-=2;
        System.out.println();
    }
    sc.close();
    }

}
