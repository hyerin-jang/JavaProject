package book;

import java.util.HashSet;

public class Ex18 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8};
        int target = 6;

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : arr) {
            if (hashSet.contains(target -i)) {
                System.out.println("true");
            }

            hashSet.add(i);
        }

        System.out.println("false");
    }
}
