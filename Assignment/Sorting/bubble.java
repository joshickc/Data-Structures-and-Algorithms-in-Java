package Sorting;

import java.util.*;;
public class bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int flag = 0;
        //bubble sort
        for (int i = 0; i < n; i++) {
            flag=0;
            for (int j = 0; j < n-i-1; j++) {
                if (a[j]>a[j+1]) 
                {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                } 
                
            }
            if (flag==0) {
                break;
            }
        }
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }

        sc.close();
    }
}
