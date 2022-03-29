package level01;
import java.util.*;

class CheckSqrRoot {
    public long solution(long n) {

        // 1. x = 루트n
        long x = (long)Math.sqrt(n);

        // 2. n가 x의 거듭제곱이라면
        if (n == Math.pow(x, 2)) {
            // x+1의 제곱을 리턴하고
            return (long)(Math.pow(x + 1, 2));
        } 
        // 아니라면 -1 리턴
        return -1;  
    }
}
