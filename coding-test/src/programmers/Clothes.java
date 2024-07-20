package programmers;

import java.util.HashMap;

public class Clothes {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        HashMap<String, Integer> hm = new HashMap<>();
        for (String[] strArr : clothes) {
            if (hm.containsKey(strArr[1])) {
                int count = hm.get(strArr[1]);
                hm.put(strArr[1], count + 1);
            } else {
                hm.put(strArr[1], 1);
            }
        }

        int answer = 1;

        for (String key : hm.keySet()) {
            int num = hm.get(key) + 1;
            answer *= num;
        }

        System.out.println(answer - 1);
    }
}
