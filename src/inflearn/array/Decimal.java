package inflearn.array;

import java.util.Scanner;

public class Decimal {
    public int solution(int n) {
        int cnt = 0;
        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                cnt++;
                for (int j = i; j <= n; j = j + i) ch[j] = 1;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Decimal T = new Decimal();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}