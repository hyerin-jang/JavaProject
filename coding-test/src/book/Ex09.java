package book;

import java.util.Stack;

public class Ex09 {
    public static void main(String[] args) {
        int n = 27;
        Stack<Integer> stack = new Stack<>();

        while (n != 0) {
            stack.push(n % 2);
            n = n / 2;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }
}
