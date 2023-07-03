package programmers;

import java.util.Scanner;

public class LowerUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder res = new StringBuilder();
        for(char c : a.toCharArray()) {
            if (Character.isLowerCase(c)) {
                res.append(Character.toUpperCase(c));
            } else {
                res.append(Character.toLowerCase(c));
            }
        }

        System.out.println(res);
    }
}
