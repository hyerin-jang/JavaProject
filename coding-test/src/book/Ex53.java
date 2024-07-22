package book;

import java.util.Arrays;
import java.util.Collections;

public class Ex53 {
    public static void main(String[] args) {
        int n = 118372;

        String[] str = String.valueOf(n).split("");
        Arrays.sort(str, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s);
        }

        Long result = Long.parseLong(sb.toString());
        System.out.println(result);
    }
}
