package HW1;


import java.util.*;
public class sum2array {
    public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }

        int m = sc.nextInt();
       int []b = new int [m];
       for (int i = 0; i < b.length; i++) {
        b[i]=sc.nextInt();
       }

        int carry=0;
        int [] result = new int [Math.max(m,n)+1];
		int i=n-1;
		int j=m-1;
		int k= result.length-1;
		int sum=0;
		while(i>=0||j>=0){
			sum=0;
			 if(i>=0){
				sum+=a[i];
				i--;
			}
			if (j>=0){
				sum+=b[j];
				j--;
			}
			sum+=carry;
			
			result[k]=sum%10;
			carry = sum/10;
			k--;

		}
		if(carry>0){
			result[k]=carry;
		}

		for (int x = 0; x < result.length; x++) {
			if(result[x]==0&&x==0){
				continue;
			}
            System.out.print(result[x]+", ");
        }
		System.out.print("END");

        
        sc.close();
	

    }
}