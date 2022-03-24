package level01;

class Solution {
    public int[] solution(long n) {

        // 1. 자연수 n을 문자열로 만들고
        String s = String.valueOf(n);

        // 2. StringBuilder 객체 생성 후 reverse
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();

        // 3. String으로 만들어 한 글자씩 배열에 넣어줌
        String[] arr = (String.valueOf(sb)).split("");

        // 4. 정수형으로 변환, 배열에 넣어 리턴
        int[] answer = new int[sb.length()];
        for(int i = 0; i < sb.length(); i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
}