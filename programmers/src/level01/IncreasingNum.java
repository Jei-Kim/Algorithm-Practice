class IncreasingNum {
    public long[] solution(int x, int n) {

        long[] answer = new long[n];
        long num = x; //int말고 long으로 해주기

        for(int i = 0; i < answer.length; i++) {
            answer[i] = num;
            num += x;
        }
        return answer;
    }
}