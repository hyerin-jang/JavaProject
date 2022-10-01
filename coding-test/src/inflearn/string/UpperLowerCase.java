package inflearn.string;

import java.util.Scanner;

public class UpperLowerCase {
    public String Solution(String str) {
        String result = "";
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            // 65~90: 대문자, 97~122: 소문자, 소문자-대문자=32
            if (c >= 65 && c <= 90) {
                result += (char) (c + 32);
            } else if (c >= 97 && c <= 122) {
                result += (char) (c - 32);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        UpperLowerCase ul = new UpperLowerCase();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(ul.Solution(input));
    }
}
