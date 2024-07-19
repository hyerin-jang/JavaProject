package book;

import java.util.Stack;

public class Ex08 {
    public static void main(String[] args) {
        String ex = "()()";
        Stack<Character> stack = new Stack<>();
        char[] charArray = ex.toCharArray();

        for(char c : charArray) {
            if (c == '(') {
                stack.push(c);
            } else if (stack.isEmpty() || stack.pop() == c) {
                System.out.println("false");
            }
        }

        System.out.println(stack.isEmpty());
    }
}
