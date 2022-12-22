package Sorting;

import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] a = new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }

        //insertion sort
        for (int i = 1; i < n; i++) {
            int pos =i;
            int temp =a[i];
            for (int j = i-1; j >=0; j--) {
                if(temp<a[j]){
                    //swap
                    a[pos]=a[j];
                    pos--;
                }
                else
                break;
            }
            a[pos]=temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
