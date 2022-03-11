import java.util.*;

public class Solution {

    public int[] solution(int n, int m) {

        /* 최대공약수 => 유클리드 호제법 이용 */

        // a > b 일 때 유클리드 호제법 성립
        int a = Math.max(n, m);
        int b = Math.min(n, m);

        // 유클리드 공식 시작 ~
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        // 유클리드 공식 끝


        /* 최소공배수 => 주어진 두 수의 곱 / 최대공약수 */
        return new int[] {a, n * m / a}; // 최대공약수, 최소공배수 순서대로

    }

}