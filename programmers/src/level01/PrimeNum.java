class PrimeNum {
    public int solution(int n) {
        
       // 1. 2~n의 수를 넣은 배열 만들기
       int[] arr = new int[n+1];
       for(int i = 2; i <= n; i++) {
           arr[i] = i;
       }

        // 2. 2의 배수들은 모두 0으로 만들기
        for(int i = 2; i <= n; i++) {
            if(arr[i] == 0) continue;

            for(int j = 2*i; j <= n; j += i) {
                arr[j] = 0;
            }
        }

        // 3. 0이 아닌 것들의 수 구하기
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) answer++;
        }
        return answer;
    }

    /* 다른 풀이법 */
    public int solution2(int n) {
        int count = 0;
        int result = 0;

        for(int i = 1; i <= n; i++) {
            // 약수의 개수 구하기
            for(int j = 1; j <= i, j++) {
                if (i % j == 0) count++;
            }
            // 약수의 개수가 2개(1과 자기자신)라면 결과 ++
            if(count == 2) result++;
            count = 0;
        }
        return result;
    }
}
