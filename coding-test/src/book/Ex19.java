package book;

import java.util.HashMap;

public class Ex19 {
    public static void main(String[] args) {
        // 참가자 participant
        // 완주자 completion
        // 한명만 완주 못함. 이 사람의 이름 반환

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};
        String answer = "";

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s : completion) {
            hashMap.put(s, 1);
        }

        for (String s : participant) {
            if (hashMap.getOrDefault(s, 0) == 0) {
                answer = s;
                System.out.println(answer);
            }
        }
    }
}
