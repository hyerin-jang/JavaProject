package book;

import java.util.Arrays;

public class Ex54 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = new int[commands.length];

        for (int a = 0; a < commands.length; a++) {
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];

            int[] sliceArray = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(sliceArray);
            result[a] = sliceArray[k - 1];
        }

        System.out.println(Arrays.toString(result));
    }
}
