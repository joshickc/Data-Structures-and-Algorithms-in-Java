package Arrays;

import java.util.Scanner;

public class diagonalTraverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] a = new int [n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]=sc.nextInt();
            }
            
        }
        int r=0;
        int max_r=n-1;
        int c=0;
        int maxc=m-1;
        int [] result = new int [m*n];
        for (int pos = 0; pos < m*n; pos++) {
            result[pos]=a[r][c];
            if ((r+c)%2==0) {
                if (c==maxc) {
                    r++;
                }
                else if(r==0){
                    c++;
                } else
                {
                    c++;
                    r--;
                }

            } 
            else
            {
                if (r==max_r) {
                    c++;
                }
                else if(c==0) {
                    r++;
                } 
                else{
                    c--;
                    r++;
                } 
                
            }


            
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }




        sc.close();
    }
}
