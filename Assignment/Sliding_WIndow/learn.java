package Sliding_WIndow;

import java.util.Scanner;

public class learn {
    public static int Solve (String s, char c, int k) {
        int j=0;
        int count =0;
        int ans =0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch!=c){
                count++;
            }
            while (count>k && j<=i) {
                if(s.charAt(j)!=c){
                    count--;
                }
                j++;
            }
            ans = Math.max(ans, (i-j)+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n =sc.nextInt();
        int k =sc.nextInt();
        String s = sc.next();
        
        int ans1=Solve(s,'a',k);
        int ans2=Solve(s,'b',k);
        int ans = Math.max(ans1,ans2);
        System.out.println(ans);
        sc.close();
    }
}
