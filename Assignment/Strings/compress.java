package Strings;
import java.util.*;
//import java.io.*;
public class compress {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.print(s.charAt(0));
    int count=1;

    for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i)==s.charAt(i-1)) {
            count++;
        }else{
            if(count>1) System.out.print(count);
            System.out.print(s.charAt(i));
            count=1;
        }
    }
    if (count>1) System.out.print(count);
        
    


    sc.close();
  }  
}
