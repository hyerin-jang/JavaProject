package programmers;

import java.util.Arrays;
import java.util.Stack;

public class SameNumNo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        Stack<Integer> stack = new Stack<>();

        for (int i : arr) {
            if (stack.isEmpty() || stack.peek() != i) {
                stack.push(i);
            }
        }

        int[] answer = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        System.out.println(Arrays.toString(answer));
    }
}
