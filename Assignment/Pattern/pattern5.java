package Pattern;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int space=n/2;
        int star =1;
        for (int i = 0; i <=n/2; i++) {

            for (int j = 1 ; j <= space; j++) {
                System.out.print("\t");
            }
            space--;
            for (int j2 = 1; j2 <= star; j2++) {
                System.out.print("*"+"\t");
            }
            star+=2;
            System.out.println();
        }
        space+=2;
        star-=4;
        for (int i = 0; i <=n/2; i++) {

            for (int j = 1 ; j <= space; j++) {
                System.out.print("\t");
            }
            space++;
            for (int j2 = 1; j2 <= star; j2++) {
                System.out.print("*"+"\t");
            }
            star-=2;
            System.out.println();
        }
        sc.close();
    }
}
