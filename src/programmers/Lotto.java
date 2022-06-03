package programmers;

import java.util.*;

public class Lotto {

    public int[] solution(int[] lottos, int[] win_nums) {
        int zero_cnt = 0;
        int win_cnt = 0;
        for (int lotto : lottos) {
            if (lotto == 0) {
                zero_cnt++;
            } else {
                win_cnt += Arrays.stream(win_nums).filter(w -> w == lotto).count();
            }
        }

        int max = win_cnt + zero_cnt;
        int min = win_cnt;

        int[] answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};
        return answer;
    }

    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        lotto.solution(lottos, win_nums);
    }

}

/**
 * >> 접근방법
 * - 최고 순위는 모르는 숫자가 다 맞은 경우
 * - 최저 순위는 모르는 숫자가 다 틀린경우
 * - 그렇기 때문에 0이 몇개인지 우선 구함
 * - 그 후, 0 제외한 나머지 숫자가 당첨 숫자랑 몇개 일치하는지 확인
 * - 제일 많이 맞춘 개수는 일치한 숫자 개수 + 0 개수
 * - 제일 적게 맞춘 개수는 일치한 숫자 개수
 *
 * >> 의문점
 * - 과연 stream을 쓰는게 괜찮을까? 그냥 for문을 쓰는게 나았을까? 코드는 간결해지긴 하는데 stream을 쓰는게 뭔가 찜찜하다....
 */
