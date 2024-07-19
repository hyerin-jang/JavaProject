package book;

import java.util.HashMap;
import java.util.Stack;

public class Ex10 {
    public static void main(String[] args) {
        String str = "}]()[{";
        HashMap<Character, Character> map = new HashMap<>();
        map.put(']', '[');
        map.put(')', '(');
        map.put('}', '{');

        int length = str.length();
        str += str;
        int answer = 0;

        A:for (int i = 0; i < length; i++) {
            Stack<Character> stack = new Stack<>();

            for (int j = i; j < i + length; j++) {
                char c = str.charAt(j);

                if (!map.containsKey(c)) {
                    stack.push(c);
                } else {
                    if (stack.isEmpty() || !stack.pop().equals(map.get(c))) {
                        continue A;
                    }
                }
            }

            if (stack.isEmpty()) answer++;
        }

        System.out.println(answer);
    }
}
