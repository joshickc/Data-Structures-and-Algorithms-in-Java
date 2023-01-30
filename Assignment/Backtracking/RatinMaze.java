package Backtracking;
import java.util.*;
public class RatinMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] []ans=new int [n][m];
        String []s= new String [n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();

        }
        Solve(0,0,s,ans);
        
        sc.close();
    }  
    public static boolean Solve(int i, int j, String[]s, int[][]ans){
        if(i==ans.length-1 && j==ans[0].length-1){
            ans[i][j]=1;
            for (int l  = 0; l < ans.length; l++) {
                for (int m = 0; m < ans[0].length; m++) {
                    System.out.print(ans[l][m]+" ");
                }
                System.out.println();
            }
            return true;
        }
        char ch=s[i].charAt(j);
        if (ch=='X') {
            return false;
        }else{
            ans[i][j]=1;
            if(j+1<ans[0].length){
                boolean d = Solve(i,j+1,s,ans);
                if(d)return true;
            }
                
            if(i+1<ans.length){
                boolean c=Solve(i+1, j, s, ans);
                if(c) return true;
            }
             
            ans[i][j]=0;
            return false;
        }
    }  
}
