class PhoneNum {
    public String solution(String phone_number) {

        StringBuilder answer = new StringBuilder(phone_number);

        for(int i = 0; i < answer.length() - 4; i++) {
            answer.setCharAt(i, '*'); //큰따옴표 아님 주의
        }
        return answer.toString();
    }
}
