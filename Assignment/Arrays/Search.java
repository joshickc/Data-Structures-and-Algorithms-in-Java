package Arrays;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]a=new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                a[i][j]=sc.nextInt();
            }
        }

        int x = sc.nextInt();
        int ans =0;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                if(a[i][j]==x){
                    ans=1;
                    break;
                }
            }
            if(ans==1)
            break;
            
        }
        System.out.println(ans);


        sc.close();
    }
}
