package Strings;

import java.util.Scanner;

public class maxFrequency {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int [] a = new int [200];
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        a[ch]++;
    }
    int max=-1;
    int idx=0;
    for(int i=0;i<200;i++){
        if(a[i]>max){
            max=a[i];
            idx=i;
        }
    }
    char ch = (char)idx;
    System.out.println(ch);

    
    sc.close();
    }
    
    
}
