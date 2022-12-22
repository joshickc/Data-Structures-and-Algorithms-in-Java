package Maths;
import java.util.*;
//import java.io.*;
public class PrateekCandy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int []a=new int[t];
        int i=0;
        while (i<t) {
            a[i++]=sc.nextInt();
          
        }
        int max=0;
        for (int j = 0; j < a.length; j++) {
            if (a[j]>max) {
                max=a[j];
            }
        }
        int []prime=new int[max+1];
        int p=2;
        prime[0]=2;
        int count=0;
        
           
            while(count<max){
                p++;
                int flag=0;
                for (int k = 2; k <= Math.sqrt(p); k++) {
                    if(p%k==0){
                        flag=1;
                        break;
                    }
                    
                }
                if (flag==0) {
                    count++;
                    prime[count]=p;
                    p++;
                } 
            }
            
        for (int j = 0; j < prime.length; j++) {
            System.out.print(prime[j]+" ");
        }

        for (int j = 0; j < a.length; j++) {
            
            System.out.println(prime[a[j]-1]);
        }


        sc.close();
    }
}
