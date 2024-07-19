package book;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Ex15 {
    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        Queue<Integer> queue = new ArrayDeque<>();

        int[] daysLeft = new int[progresses.length];
        for (int i = 0; i < speeds.length; i++) {
            daysLeft[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);


        }

        int count = 0;
        int maxDay = daysLeft[0];

        for (int i = 0; i < progresses.length; i++) {
            if (daysLeft[i] <= maxDay) {
                count++;
            } else {
                queue.add(count);
                count = 1;
                maxDay = daysLeft[i];
            }
        }

        queue.add(count);

        int[] answer = queue.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(answer));
    }
}
