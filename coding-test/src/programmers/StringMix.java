package programmers;

public class StringMix {
    public static void main(String[] args) {
        String str1 = "aaaaaa";
        String str2 = "bbbbbb";
        String answer = "";

        for(int i = 0; i < str1.length(); i++) {
            char char1 = str1.toCharArray()[i];
            char char2 = str2.toCharArray()[i];
            answer += Character.toString(char1) + Character.toString(char2);
        }
        System.out.println(answer);
    }
}
