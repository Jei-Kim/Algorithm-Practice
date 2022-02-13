package level01;

public class Sum {
    public long solution (String[] arg) {
        long answer = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for(int i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }
}