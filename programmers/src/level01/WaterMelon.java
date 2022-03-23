package level01;

class WaterMelon {
    public String solution(int n) {
    
        String answer = "";
        // 1. append 사용 위해 StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder();

        // 2. 짝수이면 "수", 홀수이면 "박" 추가
        for(int i = 0; i < answer.length(); i++) {
            sb.append(i % 2 == 0 ? "수" : "박");
        }

        // 3. 스트링화 + 리턴
        answer = sb.toString();
        return answer;
    }
}
