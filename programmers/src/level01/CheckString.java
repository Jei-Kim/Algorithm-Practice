class CheckString {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6) {
            for(ini i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c < '0' || c > '9') return false; //숫자가 아니라면(문자가 포함되어있다면)false
            }
            return true; 
        } else 
        return false;
    }
}
