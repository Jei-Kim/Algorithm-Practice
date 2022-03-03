package section02;
import java.util.*;

/* 9. 격자판 최대합
* - 5x5 격자판에 각 행, 열, 대각선의 합 중 가장 큰 합 출력
*/

class Main_09 {
	
	public int solution(int n, int[][] arr) {
		
		int answer = Integer.MIN_VALUE; //-2147000000;
		int sum1 = 0, sum2 = 0;
		
		for (int i = 0; i < n; i++) {
			sum1 = sum2 = 0;
			
			for (int j = 0; j < n; j++) {
				sum1 += arr[i][j]; // 행 고정, 열 순환
				sum2 += arr[j][i]; // 행 순환, 열 고정
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		
		sum1 = sum2 = 0;
		
		for (int i = 0; i < n; i++) {
			
			sum1 += arr[i][i];
			sum2 += arr[i][n - i - 1]; // 대각선
		}
		
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		return answer;
	}

	public static void main(String[] args) {
		
		Main_09 T = new Main_09();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.print(T.solution(n, arr));
	}
}
