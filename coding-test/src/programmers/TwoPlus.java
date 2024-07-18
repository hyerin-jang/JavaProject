package programmers;

import java.util.Arrays;
import java.util.HashSet;

// 서로 다른 인덱스에 있는 2개의 수를 뽑아 더해 만들 수 있는 모든 수를 배열의 오름차순으로 담아 반환
public class TwoPlus {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i+1; j < numbers.length; j ++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] arr = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
