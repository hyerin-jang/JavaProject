package inflearn.string;

import java.util.Scanner;

public class StringSearch {
    public int solution(String str, char c) {
        int result = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for (char t : str.toCharArray()) {
            if (t == c) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        StringSearch M = new StringSearch();
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);
        System.out.println(M.solution(input1, input2));
    }
}