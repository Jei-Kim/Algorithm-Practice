class CaesarCipher {
    public String solution(String s, int n) {

        String answer = "";

        //for문에서 charAt으로 한글자씩 뽑아주기

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
        }
            //뽑아낸 하나의 글자가 소문자일 경우
            if(Character.isLowerCase(c)){
            //z이상의 글자 계산
            c = (char)((c - 'a' + n) % 26 + 'a')
            }
            
            //대문자일 경우
            else if(Character.isUpperCase(c)) {
                c = (char)((c - 'A' + n) % 26 + 'A');
            }
            answer += c;
        }
        return answer;
    }
}