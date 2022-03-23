class StrToInt {
    public int solution(String s) {

        boolean Sign = true;
        int result = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '-') Sign = false;
            else if (ch != '+') result = result * 10 (ch - '0');
        }
        return Sign ? 1 : -1 * result;

        /*
        기타 풀이 - 문자열 s를 숫자로 반환한 결과 리턴
        return Integer.parseInt(s);
        */


    }
}
