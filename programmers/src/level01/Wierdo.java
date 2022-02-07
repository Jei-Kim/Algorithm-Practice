class Wierdo {
    public String solution(String s) {

        StringBuilder sb = new StringBuilder();
        int index = 0;

        for(char c : s.toCharArray()) {
            if(c == ' ') {
                index = 0;
                sb.append(Character.toUpperCase(c));
            }
            sb.append(Character.toLowerCase(c));
        }
        return String.valueOf(sb);
    }
}