package Question;

import java.util.Scanner;

public class sortbooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        char [] subject = new char [n];
        for (int i = 0; i < subject.length; i++) {
            char c = sc.next().charAt(0);
            subject[i]= c;
        }
        int p=0,c=0,m=0;
        for (int i = 0; i < subject.length; i++) {
            if(subject[i]=='P')
            p++;
            else if(subject[i]=='C')
            c++;
            else
            m++;
        }
        for (int i = 0; i < p; i++) {
            subject[i]='P';
        }
        for (int i = p; i < p+c; i++) {
            subject[i]='C';
        }
        for (int i = p+c; i < p+c+m; i++) {
            subject[i]='M';
        }
        for (int i = 0; i < subject.length; i++) {
            System.out.print(subject[i]+" ");
        }
        sc.close();
    }
    
}
