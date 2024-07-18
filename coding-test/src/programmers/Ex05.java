package programmers;

import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        // m * k k * n -> m * n
        System.out.println();
        int m = arr1.length; // 3
        int l = arr1[0].length; // 2
        int n = arr2.length; // 2

        int [][] answer = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < l; k++) {
                    answer[i][j] = arr1[i][k] * arr2[j][k];
                }
            }
        }
        System.out.println(Arrays.deepToString(answer));
    }
}
