package programmers;

public class NewId {

    public String solution(String new_id) {
        String answer = "";

        // 1) 대문자 -> 소문자
        answer = new_id.toLowerCase();

        // 2) 사용 불가능 문자 제거
        answer = answer.replaceAll("[^\\w\\-_.]", "");

        // 3) . 연속일때 제거
        answer = answer.replaceAll("\\.{2,}", ".");

        // 4) 처음과 끝에 있는 . 제거
        answer = answer.replaceAll("^[.]|[.]$", "");

        // 5) "" 이면 a 대입
        if (answer.isEmpty()) {
            answer = "a";
        }

        // 6) 길이 15개 초과면 제거. 제거 후 마지막이 .이면 .도 제거
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
            if (answer.charAt(answer.length() - 1) == '.') {
                answer = answer.replaceAll("[.]$", "");
            }
        }

        // 7) 길이 2이하면 길이가 3이상 될때까지 마지막 문자 붙이기
        while (answer.length() <= 2) {
            answer += answer.charAt(answer.length() - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        NewId newId = new NewId();
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        newId.solution(new_id);
    }

}

