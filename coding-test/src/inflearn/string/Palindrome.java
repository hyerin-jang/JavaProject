package inflearn.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
    public ArrayList<String> Solution(int num, String[] str) {
        ArrayList<String> result = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            result.add(tmp);

//            char[] c = x.toCharArray();
//            int lt=0;
//            int rt=0;
//            while (lt<rt) {
//                char temp = c[lt];
//                c[lt] = c[rt];
//                c[rt] = temp;
//                lt++;
//                rt--;
//            }
//            String tmp = String.valueOf(c); // valueOF: static 으로 선언된 class method
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            str[i] = input.next();
        }

        Palindrome P = new Palindrome();
        for (String s : P.Solution(num, str)) {
            System.out.println(s);
        }
    }
}
