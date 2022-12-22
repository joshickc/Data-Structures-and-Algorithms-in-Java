package Class7;
public class problem1 {
    public static void main(String[] args) {
        int i = 32145;
        int rem;
        int pos = 1;
        int n = 0;
       while(i>0){
        rem = i%10;
        n+= pos*Math.pow(10,rem-1);
        i=i/10;
        pos++;


       }
       System.out.println(n);
    }}
