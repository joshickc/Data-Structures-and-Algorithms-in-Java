package Arrays;

import java.util.Scanner;

public class peakelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] a = new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int ans =-1;
        for (int i = 1; i < n-1; i++) {
            if(a[i]>a[i-1] && a[i]>a[i+1]){
                ans=i;
                break;
            }
        }
        if (ans==-1) {
            System.out.println("No Peak Element");
            
        } else {
            System.out.println(ans);
        }
        sc.close();
    }
    
}
