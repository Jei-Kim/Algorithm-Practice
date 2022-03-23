package level01;

class CheckString {
    public boolean solution(String s) {
    
        // 1. 문자열 s의 길이가 4 혹은 6이면서, 모두 숫자이면 true 리턴
        if(s.length() == 4 || s.length() == 6) {
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c < '0' || c > '9')
                return false;
            }
            return true;
        } else 
     return true;
    }
}
