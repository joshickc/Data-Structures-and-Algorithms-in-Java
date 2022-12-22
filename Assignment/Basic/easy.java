package Basic;

import java.util.*;

public class easy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a= new int [n];
        for (int i = 0; i < a.length; i++) {
           a[i]=sc.nextInt(); 
           //2int num=1;
           int sumo=0;
           int sume=0;
           int temp=a[i];
           int digits=0;
           while (temp>0) {
            digits++;
            temp=temp/10;
           }
           while(a[i]>0){
            int rem=a[i]%10;
            if (digits%2!=0) {
                sumo+=rem;
                digits--;
            }else{
                sume+=a[i];
                digits--;
            }
                a[i]/=10;
           }
           if (sumo%3==0&&sume%4==0) {
            System.out.println("Yes");
           }else{
            System.out.println("No");
           }
        }
        
    
        
        sc.close();
     
    }



    public static int Max_Sum(int []a, int n) {
        int sum=0;
        int best=0;
        for (int i = 0; i <= 2*n-1; i++) {
            sum=Math.max(sum+a[i%n], a[i%n]);
            best=Math.max(best, sum);
        }
        
        return best;
        
    }




    public static int convert(int b1, int b2, int n) {
        int ans=0;
        int count=1;
        while (n>0) {
            int rem = n%10;
            ans=ans+count*rem;
            count*=b1;
            n=n/10;
        }
        n=ans;
        ans=0;
        //long count=1;
        while (n>0) {
            int rem= n%b2;
            ans=ans*10+rem;
            n=n/b2;
        }
        int reverse=0;
        while(ans>0){
            int rem =ans%10;
            reverse =reverse*10+rem;
            ans/=10;
        }
        
        return reverse;
        
    }







    public static long DecimalToOctal(int n) {
        long ans=0;
        //long count=1;
        while (n>0) {
            int rem= n%8;
            ans=ans*10+rem;
            n=n/8;
        }
        long reverse=0;
        while(ans>0){
            long rem =ans%10;
            reverse =reverse*10+rem;
            ans/=10;
        }
        
        return reverse;
       
    }


    public static int BinaryToDecimal(int n) {
        int ans=0;
        int count=1;
        while (n>0) {
            int rem = n%10;
            ans=ans+count*rem;
            count*=2;
            n=n/10;
        }
        return ans;
    }


    public static int setbits(int n) {
        int count=0;
        while (n>0) {
            int rem=n%2;
            if (rem==1) {
                count++;
            }
            n=n/2;
        }

        return count;
        
    }



    public static void FahreniteToCelcius() {
        Scanner sc = new Scanner(System.in);
        int min =sc.nextInt();
        int max =sc.nextInt();
        int step = sc.nextInt();
        for (int i = min; i <=max; i+=step) {
            int c = (i-32)*5/9;
            System.out.println(i +"\t"+c);
            
        }

       sc.close();
    }








    public static void inverse() {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int reverse=0;
        int count =0;
        int digit =0;
        int temp=n;
        while (n>0) {
            digit++;
            n=n/10;
            
        }
        int [] arr = new int [digit+1];
        n=temp;
        while (n>0) {
            int rem = n%10;
            count++;
            arr [rem]=count;
            n=n/10;
            
        }
        for (int i = arr.length-1; i >=1; i--) {
            reverse=reverse*10+arr[i];
        }
        System.out.println(reverse);
       sc.close();
    }



    public static int Factorial(int rem) {
        if(rem==0){
            return 1;
        }
        return rem*Factorial(rem-1);
        
    }
    public static int Search(int []a, int m) {
        for (int i = 0; i < a.length; i++) {
            if(a[i]==m)
            return i;
        }

        return -1;    
    }
}
