package Sliding_WIndow;

import java.util.ArrayList;
import java.util.Scanner;

public class frequency {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        int [] b = new int [n];
        
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            b[i]=sc.nextInt();
        }

        int []freq1 = new int [(int) 1e6];

        for (int i = 0; i < a.length; i++) {
            freq1[a[i]]++;
        }

        int []freq2 = new int [(int) 1e6];
        for (int i = 0; i < a.length; i++) {
            freq2[b[i]]++;
        }

        int []freq3 = new int [(int) 1e6];
        for (int i = 0; i < freq1.length; i++) {
            freq3[i]=Math.min(freq1[i], freq2[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < freq1.length; i++) 
            {
                if (freq3[i]>0)
                {
                        for (int j = 0; j <freq3[i]; j++) 
                        {
                            list.add(i);
                        }
                        
                    }
                    
            }
            System.out.println(list);
            sc.close();
    }
        
}

