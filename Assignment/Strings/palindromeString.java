package Strings;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //int n = s.length();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length(); j++) {
                String sub = s.substring(i, j);
                if (IsPalindrome(sub)) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
    public static boolean IsPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        int flag=0;
        while (left<right) {
            if (s.charAt(left)==s.charAt(right)) {
                left++;
                right--;
            } else {
                flag=1;
                break;
            }
            
        }
        if (flag==0) {
            return true;
        } else {
            return false;
        }
    }
}
