package Basic;

import java.util.Scanner;

public class thanos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
        }
        int count=0;
        int pos =0;
        for (int i = 0; i < n; i++) {
            if (a[pos]==a[i]) {
                count++;
            }
            else{
                pos=i;
                count=0;
            }
            if (count<2) {
                System.out.print(a[pos]+" ");
                
            }
        }

       sc.close(); 
    }
}
