package programmers;

public class StringListToString {
    public static void main(String[] args) {
        String[] str = {"a","b","c"};
        String answer = "";
        answer = String.join("", str);
        System.out.println(answer);
    }
}
