package programmers;

import java.util.*;

public class MemberReport {

    public int[] solution(String[] id_list, String[] report, int k) {
        // 각 유저가 받은 결과 메일 수 배열을 유저 Id 만큼 생성
        int[] answer = new int[id_list.length];

        Map<String, Set<String>> report_map = new HashMap<>();
        Map<String, Integer> report_count = new HashMap<>();
        List<String> count_list = new ArrayList<>();

        // 신고 목록 배열
        for (int j = 0; j < report.length; j++) {
            // 유저 id
            String user_id = report[j].split(" ")[0];
            // 신고당한 id
            String report_id = report[j].split(" ")[1];

            // 중복제거 위해 set 사용
            // key: 신고당한 사람 id, value: 신고한 사람 id
            Set<String> report_list;
            if (!report_map.containsKey(report_id)) {
                report_list = new HashSet<>();
            } else {
                report_list = report_map.get(report_id);
            }

            report_list.add(user_id);
            report_map.put(report_id, report_list);
        }

        System.out.println(report_map);

        // userId 별로 돌기
        for (int i = 0; i < id_list.length; i ++) {
            int count = 0;
            for (String report_key : report_map.keySet()) {
                Set<String> report_set = report_map.get(report_key);
                if (report_set.size() >= k && report_set.contains(id_list[i])) {
                    count++;
                }
            }

            answer[i] = count;
        }

        return answer;
    }

    public static void main(String[] args) {
        MemberReport mr = new MemberReport();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        mr.solution(id_list, report, k);
    }
}

/**
 * >> 접근 방법
 * - 신고는 중복이 불가능 하기 때문에 HashSet 사용
 * - 신고당한 id 를 key로 하고, key를 신고한 user의 id HashSet을 value로 함
 * - HashSet의 size가 k보다 크거나 같을 경우 정지 시킴
 * - user list 목록을 돌면서 신고자 중 몇명이 정지됐는지 count 해서 answer 배열에 담음
 *
 * >> 다른 답변 예시
 * class Solution {
 *     public int[] solution(String[] id_list, String[] report, int k) {
 *         List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
 *         HashMap<String, Integer> count = new HashMap<>();
 *         for (String s : list) {
 *             String target = s.split(" ")[1];
 *             count.put(target, count.getOrDefault(target, 0) + 1);
 *         }
 *
 *         return Arrays.stream(id_list).map(_user -> {
 *             final String user = _user;
 *             List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
 *             return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
 *         }).mapToInt(Long::intValue).toArray();
 *     }
 * }
 */
