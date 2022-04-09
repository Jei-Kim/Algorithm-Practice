package level01;
class SumOfMatrix {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        // 조건: arr1과 arr2의 행렬 크기는 같음
        
        int[][] answer = new int[arr1.length][arr1[0].length];  // [행의길이][열의길이]

        // for문 돌면서 각 행, 열의 덧셈 구하기
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
