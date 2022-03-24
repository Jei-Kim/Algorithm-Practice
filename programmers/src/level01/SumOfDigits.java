package level01;
import java.util.*;

public class Solution {
    public int solution(int n) {

    int sum = 0;
    
    // 1. n의 각 자릿수의 합 구해서 리턴
    while(n > 0) {
        sum += n % 10;
        n = n / 10;
    }
    return sum;
    }
}
