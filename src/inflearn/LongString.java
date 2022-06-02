package inflearn;

/*한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
문장속의 각 단어는 공백으로 구분됩니다.*/


import java.util.Scanner;

public class LongString {
    public String Solution (String input) {
        String result = "";
        int minVal = Integer.MIN_VALUE;
        String[] arr = input.split(" ");

        for(String s : arr) {
            int len = s.length();
            if(len > minVal) {
                minVal = len;
                result = s;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        LongString s = new LongString();
        System.out.println(s.Solution(input));
    }
}
