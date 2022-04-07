package level01;

class PhoneNum {
    public String solution(String phone_number) {

        // 1. 가변, 속도 빠른 StringBuilder 객체 생성
        StringBuilder answer = new StringBuilder(phone_number);

        // 2. 뒷 4자리를 제외한 나머지를 전부 *로 변경 후 리턴
        for(int i = 0; i < answer.length() - 4; i++) {
            answer.setCharAt(i, '*'); // 작은따옴표 주의
        }
        return answer.toString();
    }
}
