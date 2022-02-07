class HarshadNum {
    public boolean solution(int x) {

        boolean answer = true;
        int num = x;
        int sum = 0; //자릿수의 합

        /* 자릿수 더하기 공식 */
        while(x != 0) { 
            sum += x % 10;
            x /= 10; 
        }

       if(num % sum == 0) { // 나누어 떨어지면 하샤드 수
          return answer;
       } 
        return false;
    }
}