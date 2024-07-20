package programmers;

import java.util.HashSet;

public class PhoneNumList {
    public static void main(String[] args) {
        String[] phone_book = {"123","456","789"};

        HashSet<String> hashSet = new HashSet<>();
        String str = phone_book[0];

        for (int i = 1; i < phone_book.length; i++) {
            int size = str.length();
            hashSet.add(phone_book[i].substring(0, size));
        }

        if (hashSet.contains(str)) {
            System.out.println("false");;
        }

        System.out.println("true");;
    }
}
