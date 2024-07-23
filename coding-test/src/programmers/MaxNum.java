package programmers;

import java.util.Arrays;

public class MaxNum {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};

        String[] str = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, ((o1, o2) -> (o2 + o1).compareTo(o1 + o2)));

        StringBuilder sb = new StringBuilder();
        for (String c : str) {
            sb.append(c);
        }

        String answer = sb.toString();
        if (answer.startsWith("0")) {
            answer = "0";
        }

        System.out.println(answer);
    }
}
