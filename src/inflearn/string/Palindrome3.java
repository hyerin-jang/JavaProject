package inflearn.string;

import java.util.*;

public class Palindrome3 {
    public String solution(String str) {
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) answer = "YES";

//        String answer="YES";
//        str=str.toUpperCase();
//        int len=str.length();
//        for(int i=0; i<len/2; i++){
//            if(str.charAt(i)!=str.charAt(len-i-1)) answer="NO";
//        }

        return answer;
    }

    public static void main(String[] args) {
        Palindrome3 T = new Palindrome3();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}