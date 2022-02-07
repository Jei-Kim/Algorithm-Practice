class PrimeNum {
    public int solution(int n) {
        
        int answer = 0;
        
        //2~n까지의 수를 넣은 배열 만들기
        int[] arr = new int[n+1];
        for(int i = 2; i <= n; i++) {
            arr[i] = i;
        }
        
        //2의 배수들을 모두 0으로 만들기
        for(int i = 2; i <= n; i++) {
            if(arr[i] == 0) continue;
            
            for(int j = 2*i; j <= n; j += i){
                arr[j] = 0;
            }
        }
        
        //0이 아닌 것들의 개수
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) answer++;
        }
        return answer;
    }
}
