package programmers;

import java.util.*;

public class EngNum {

    public int solution(String s) {
        int answer = 0;

        HashMap<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        for (String k : map.keySet()) {
            s = s.replaceAll(k, map.get(k));
        }

        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        EngNum engNum = new EngNum();
        String s = "one4seveneight";
        engNum.solution(s);
    }

}

/**
 * 다른 풀이
 * class Solution {
 *     public int solution(String s) {
 *         int answer = 0;
 *         StringBuilder sb = new StringBuilder("");
 *         int len = s.length();
 *         String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
 *         String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};
 *
 *         for(int i=0; i<10; i++){
 *             s = s.replaceAll(alphabets[i],digits[i]);
 *         }
 *
 *         return Integer.parseInt(s);
 *     }
 * }
 */
