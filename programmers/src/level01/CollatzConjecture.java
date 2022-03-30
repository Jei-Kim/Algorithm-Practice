package level01;

class CollatzConjecture {
    public int solution(long num) {

        int answer = 0;

        while(num != 1) {
        // 입력된 수가 짝수라면 2로 나눔
        if(num % 2 == 0) {
            num /= 2;
            // 홀수라면 3을 곱하고 1을 더함
        } else {
          num = num * 3 + 1;
        }
        // 위의 과정을 몇 번 반복했는지 카운트
          answer++;

          // 500번을 반복해도 1이 되지 않는다면 -1 리턴
            if(answer == 500){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}

