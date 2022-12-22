package CodeForces;

import java.util.Scanner;

public class VasyaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();

        int ans=0,count=0,pos=0;
        int temp=k;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (ch=='a') {
                count++;
            } else if(ch=='b' && temp==k && temp>0) {
               pos = i;
               temp--; 
                count++;
            }else if(ch=='b' && temp>0){
                temp--;
                count++;
            }else if (ch=='b' && temp==0){
                ans = Math.max(ans,count);
                count=0;
                i=pos;
                temp=k;
            }
        }
        ans = Math.max(ans,count);

        count=0;pos=0;
        temp=k;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (ch=='b') {
                count++;
            } else if(ch=='a' && temp==k && temp>0) {
               pos = i;
               temp--; 
                count++;
            }else if(ch=='a' && temp>0){
                temp--;
                count++;
            }else if (ch=='a' && temp==0){
                ans = Math.max(ans,count);
                count=0;
                i=pos;
                temp=k;
            }
        }
        ans = Math.max(ans,count);
        System.out.println(ans);
        sc.close();
    }
}