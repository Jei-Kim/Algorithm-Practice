package level01;

class IncreasingNum {
    public long[] solution(int x, int n) {

        long[] answer = new long[n];
        long num = x;

        // x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트 구하기
        for(int i = 0; i < answer.length; i++) {
            answer[i] = num;
            num += x;
        }
        return answer;
    }
}