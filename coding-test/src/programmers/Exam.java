package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam {
    // 12345
    // 21232425 / 21232425
    // 3311224455/ 3311224455
    // 가장 높은 점수 받은 사람 (오름차순)
    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};
        int [][] patterns = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] scores = new int[3];
        for(int i = 0; i < answers.length; i++) {
            for(int j = 0; j < patterns.length; j++) {
                if(answers[i] == patterns[j][i % patterns[j].length]) {
                    scores[j]++;
                }
            }
        }

        int maxScore = Arrays.stream(scores).max().getAsInt();

        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < scores.length - 1; i++) {
            if(scores[i] == maxScore) {
                answer.add(i + 1);
            }
        }

        int[] result = answer.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(result));
    }
}
