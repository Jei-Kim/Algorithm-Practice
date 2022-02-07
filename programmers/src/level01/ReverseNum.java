class Solution {
    public int[] solution(long n) {

        String s = String.valueOf(n); // long -> string 
        //String s = new String(n +"")도 가능

        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();

        String[] arr = (String.valueOf(sb)).split("");//sb -> s 후 한글자씩 배열에 넣고

        int[] answer = new int[sb.length()];

        for(int i = 0; i < sb.length(); i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
        return answer;

    }
}