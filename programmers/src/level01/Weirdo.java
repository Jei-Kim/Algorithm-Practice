class Weirdo {
    public String solution(String s) {

        // 1. StringBuilder 클래스 생성하고
        StringBuilder sb = new StringBuilder();
        int index = 0;

        // 2. 문자열에서 한 글자씩 뽑아서 
        for(char c : s.toCharArray()) {
            // 공백이라면 인덱스 초기화 후
            if(c == ' ') {
                index = 0;
                // 짝수번째 알파벳은 대문자로,
                sb.append(Character.toUpperCase(c));
            }
            // 홀수번째 알파벳은 소문자로 바꿔 리턴
            sb.append(Character.toLowerCase(c));
        }
        return String.valueOf(sb);
    }

    /* 기타풀이 - 삼항연산자 이용 */

    public String solution2(String s) {

        String answer = "";
        int cnt = 0;
        String[] arr = s.split("");

        for(String ss : arr) {
            cnt = ss.contains(" ") ? 0 : cnt+1;
            answer += cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }
}