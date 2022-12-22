package Basic;

import java.util.Scanner;


public class unique {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int []f= new int[(int) 1e7];
        for (int i = 0; i < a.length; i++) {
            f[a[i]]++;   
        }
        for (int i = 0; i < f.length; i++) {
            if(f[i]%2!=0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}