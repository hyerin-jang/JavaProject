package book;

import java.util.Arrays;

public class Ex52 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        Arrays.sort(strings, ((o1, o2) ->
                o1.charAt(n) == o2.charAt(n) ?
                        o1.compareTo(o2) : Character.compare(o1.charAt(n), o2.charAt(n))));

        System.out.println(Arrays.toString(strings));
    }
}
