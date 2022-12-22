package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class mergeArrays 
{   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int []a = new int [n];
    for (int i = 0; i < a.length; i++) {
        a[i]=sc.nextInt();
    }
    int []b = new int [n];
    for (int i = 0; i < b.length; i++) {
        b[i]=sc.nextInt();
    }
    int []c= new int[2*n];
    int j=0;
    for (int i = 0; i < a.length; i++) {
        c[j]=a[i];
        j++;
    }
    
    for (int i = 0; i < b.length; i++) {
        c[j]=b[i];
        j++;
    }
    Arrays.sort(c);

    System.out.println(c[(0+c.length-1)/2]);
    sc.close();
    
}
    
}
