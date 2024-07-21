package book;

public class Ex50 {
    public static void main(String[] args) {
        String str = "hello";

        int[] counts = new int[26];

        for (char c : str.toCharArray()) {
            counts[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < counts[i]; j++) {
                sb.append((char) (i + 'a'));
            }
        }

        System.out.println(sb);
    }
}
