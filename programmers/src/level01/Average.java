package level01;
import java.util.Arrays;

class Average {
    public double solution(int[] arr) {

        double answer = 0;
        double sum = 0;

        // 1. 합계 누적
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // 2.  평균 구해서 리턴
        answer = sum / arr.length;
        return answer;
    }
    /* 기타 풀이 - 라이브러리사용
    public class GetMean {
        public int getMean(int[] arr) {
            return Arrays.stream(arr).averager().orElse(0);
        }
    }
        */
}
