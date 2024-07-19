package book;

import java.util.Arrays;

public class Ex01 {
    public Ex01() {
    }

    public static void main(String[] args) {
        int[] arr = {1, -5, 2, 4, 3};
        Arrays.sort(arr);

        System.out.print(Arrays.toString(arr));
    }
}
