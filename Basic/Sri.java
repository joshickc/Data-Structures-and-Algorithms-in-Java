package Basic;

import java.util.Scanner;

public class Sri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []a= new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int sum=0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            sum =0;
            for (int j = i; j < a.length; j++) {
                sum+=a[j];
                if (sum%k==0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        
        sc.close();
    }
}
