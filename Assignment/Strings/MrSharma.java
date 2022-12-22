//Not done yet
package Strings;
import java.util.*;
//import java.io.*;
public class MrSharma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res="";
        while (n-->0) {
            String s =sc.next();
            int [] freq=new int [256];
            if (s.length()==1) {
                freq[s.charAt(0)]++;
                
            }
            else{
                for (int i = 0; i < s.length()-1; i++) {
                    if(s.charAt(i)==s.charAt(i+1)){
                        i++;
                    }
    
                    else{
                        if(freq[s.charAt(i)]<1)
                            freq[s.charAt(i)]++;
                    }
    
                    }
    
                    if(s.charAt(s.length()-1)!=s.charAt(s.length()-2)){
                        if(freq[s.length()-1]<1)
                            freq[s.charAt(s.length()-1)]++;
                    }

            }
            
                for (int i = 0; i < freq.length; i++) {
                    if (freq[i]>0) {
                        char ch =(char)i;
                        res+=ch;
                    }
                }
                if (res.length()>0) {
                    System.out.println(res);
                } else {
                    System.out.println("-1");
                }
                
                res="";
                
            }
            sc.close();
        }
    }

