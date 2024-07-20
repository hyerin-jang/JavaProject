package programmers;

import java.util.HashSet;

public class Ponkemon {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};

        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums) {
            hs.add(i);
        }

        int answer = Math.min(hs.size(), nums.length / 2);
        System.out.println(answer);
    }
}
