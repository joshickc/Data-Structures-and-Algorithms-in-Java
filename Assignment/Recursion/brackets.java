package Recursion;

import java.util.*;

public class brackets {
    static String s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        boolean b = BalancedBrackets(0, 0, 0, 0);
        System.out.println(b);
        sc.close();
    }

    private static boolean BalancedBrackets(int i, int sqb, int cb, int simb) {// square bracket curly bracket simple bracket
        if (i==s.length()) {//s.length()==0||
            if (sqb == 0 && cb == 0 && simb == 0) {
                return true;
            }
            else{
                return false;
            }
        }

        char ch = s.charAt(i);
        if (ch == '[') {
            sqb++;
        }
        else if (ch == '{') {
            cb++;
        }
        else if (ch == '(') {
            simb++;
        }
        if (ch == ')') {
            simb--;
        }
        else if (ch == '}') {
            cb--;
        }
        else if (ch == ']') {
            sqb--;
        }
        if (sqb < 0 || cb < 0 || simb < 0) {
            return false;
        }
        return BalancedBrackets(i+1, sqb, cb, simb);
    }
}
//Leet Code 0 ms
// class Solution {
//     public boolean isValid(String s) {
//         int len = s.length();
//         if(len % 2 != 0) return false;
        
//         char[] stack = new char[len];
//         int stackPointer = -1;
//         for(char paren : s.toCharArray()){
//             if(paren == '(' || paren == '[' || paren == '{'){
//                 stackPointer++;
//                 stack[stackPointer] = paren;
//             }
//             else if((paren == ')' || paren == ']' || paren == '}') && stackPointer == -1)
//                return false;
//             else if(paren == ')' && stack[stackPointer] != '(')
//                 return false;
//             else if(paren == ']' && stack[stackPointer] != '[')
//                 return false;
//             else if(paren == '}' && stack[stackPointer] != '{')
//                 return false;
//             else
//                 stackPointer--;
//         }
//         return stackPointer == -1;
//     }
// }