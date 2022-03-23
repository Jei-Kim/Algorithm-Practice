package level01;

public class Sum {
    public long solution (int a, int b) {
       
       long answer = 0;

        // 1. 정수 a, b 크기 정렬
        int min = Math.min(a,b);
        int max = Math.max(a,b); 

        // 2. 두 정수 사이의 수 모두 합해서 리턴
        for(int i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }
}