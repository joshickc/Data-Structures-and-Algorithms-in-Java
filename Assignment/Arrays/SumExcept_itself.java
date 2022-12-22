package Arrays;

import java.util.Scanner;

public class SumExcept_itself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] a = new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }

        int [] left_prefix= new int [n];
        left_prefix[0]=1;

        for (int i = 1; i < left_prefix.length; i++) {
            left_prefix[i]=left_prefix[i-1]*a[i-1];
        }
        int [] right_prefix= new int [n];
        right_prefix[n-1]=1;

        for (int i = n-2; i >=0; i--) {
            right_prefix[i]=right_prefix[i+1]*a[i+1];
        }
        int [] sum = new int [n];
        for (int i = 0; i < right_prefix.length; i++) {
            sum[i]=left_prefix[i]*right_prefix[i];
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i]+" ");
        }

     sc.close();
    }

}
