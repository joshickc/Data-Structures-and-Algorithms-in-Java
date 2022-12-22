package Class7;
import java.util.*;

public class array {
    public static void main(String[] args) {
        int []a= new int [3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            a[i]= sc.nextInt();
        }

        for(int j=0;j<3;j++){
            System.out.println(a[j]);
        }
        sc.close();
    }

}
