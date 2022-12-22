package Arrays;
import java.util.*;
//import java.io.*;
public class Radha {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int []a = new int [n];
    for ( int i = 0; i < a.length; i++) {
        a[i]=sc.nextInt();
    }
    int count=0;
    for (int j = 0; j < a.length-1; j++) {
        if (a[j]<a[j+1]) {
            count++;
        }

        if(count>1){
            break;
        }
    }
    if (count<=1) {
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
    sc.close();
  }  
}
