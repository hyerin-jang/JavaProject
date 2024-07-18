package programmers;

import java.util.Arrays;
import java.util.Collections;

public class ArrayControl {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 1, 3, 4};

        Integer[] array = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(array, Collections.reverseOrder());

        int[] result = Arrays.stream(array).mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(result));
    }
}
