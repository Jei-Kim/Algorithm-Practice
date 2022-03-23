package level01;

class SumOfDivisors {
    public int solution(int n) {

        int sum = 0;

        // 1. 약수를 모두 더한 값 구해서 리턴
        for(int i = 1; i <= n; i++) {
            if(n % i == 0)
              sum += i;  
        }
        return sum;
    }
}
