package HW1;

import java.util.Scanner;

public class prefix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int [] pre = new int [n+1];

        int q =sc.nextInt();
        while (q>0) {
            q--;
            int l = sc.nextInt();
            int r = sc.nextInt();
            int z = sc.nextInt();
            pre[l] +=z;
            pre[r+1]-=z;
        }
        int sum = 0;
        for (int i = 0; i < pre.length; i++) {
            sum+=pre[i];
            pre[i]=sum;
        }
        for (int i = 0; i < pre.length; i++) {
            System.out.print(pre[i]+" ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            arr[i]+=pre[i];
            
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();






        sc.close();
    }
}
