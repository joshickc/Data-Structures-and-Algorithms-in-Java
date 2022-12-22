package Arrays;
import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();

        int [][] a = new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j]=sc.nextInt();
            }           
        }  
        int min_row=0;
        int max_row=n-1;
        int min_c=0;
        int max_c=m-1;
        int count=0;
        int total=n*m;
        while (count<total) {
            for (int i = min_c; i <=max_c && count<total; i++) {
                System.out.print(a[min_row][i]+" ");
                count++;
            }
            min_row++;
            for (int i = min_row; i <=max_row && count<total; i++) {
                System.out.print(a[i][max_c]+" ");
                count++;
            }
            max_c--;
            for (int i = max_c; i >=min_c && count<total; i--) {
                System.out.print(a[max_row][i]+" ");
                count++;
            }
            max_row--;
            for (int i = max_row; i >=min_row && count<total; i--) {
                System.out.print(a[i][min_c]+" ");
                count++;
            }
            min_c++;
        }
        System.out.println();
        anticlockwise(n,m,a);

      sc.close();  
    }


public static void anticlockwise(int n, int m, int[][] a) {
    int min_row=0;
    int max_row=n-1;
    int min_c=0;
    int max_c=m-1;
    int count=0;
    int total=n*m;
    while (count<total) {
        for (int i = min_row; i <=max_row && count<total; i++) {
            System.out.print(a[i][min_c]+" ");
            count++;
        }
        min_c++;
        for (int i = min_c; i <=max_c && count<total; i++) {
            System.out.print(a[max_row][i]+" ");
            count++;
        }
        max_row--;
        for (int i = max_row; i >=min_row && count<total; i--) {
            System.out.print(a[i][max_c]+" ");
            count++;
        }
        max_c--;
        for (int i = max_c; i >=min_c && count<total; i--) {
            System.out.print(a[min_row][i]+" ");
            count++;
        }
        min_row++;
        
    }
}
}