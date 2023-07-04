package programmers;

public class OverwriteString {
    public String solution(String my_string, String overwrite_string, int s) {
        int i = overwrite_string.length();
        return my_string.substring(0, s) + overwrite_string + my_string.substring(s + i);
    }
}
