package Arrays;
import java.util.*;
//import java.io.*;
public class toeplitz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m =sc.nextInt();
    int [][] a = new int [n][m];
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[0].length; j++) {
            a[i][j]=sc.nextInt();
        }
        
    }
    //check diagonal starting from 1st row
    int flag=0;

    for (int j = 0; j < a[0].length; j++) {
        
        int b=0;
        int c=j;
        while(b<n-1 && c<m-1){
           if ((a[b][c])!=a[b+1][c+1]) {
            flag=1;
            break;
           }
           b++;
           c++;
        }
        if(flag==1)
        break;

    }

    if(flag==0)
    
    {
        //check diagonal starting from 1st column
        
        for (int i = 1; i < a.length; i++) {
            int b=i;
            int c=0;
            while(b<n-1 && c<m-1){
               if ((a[b][c])!=a[b+1][c+1]) {
                flag=1;
                break;
               }
               b++;
               c++;
            }
            if(flag==1)
            break;
    
        }

    }
    if(flag!=0)
    System.out.println("false");
    else
    System.out.println("true");

    sc.close();
  }  
}
