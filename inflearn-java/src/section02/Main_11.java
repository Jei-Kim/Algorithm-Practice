package section02;
import java.util.*;

/* 11. 임시 반장 정하기
* - 표(이차원배열) 돌면서 가장 많이 중복되는 학생 구하기 
*/

public class Main_11 {

	public int solution(int n, int[][] arr) {

		int answer = 0, max = 0;

		for (int i = 1; i <= n; i++) {

			int cnt = 0;

			for (int j = 1; j <= n; j++) {

				for (int k = 1; k <= 5; k++) {
					if (arr[i][k] == arr[j][k]) { // 학년과 반이 같은 경우
						cnt++;
						break;
					}
				}
			}

			if (cnt > max) {
				max = cnt;
				answer = i;
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		Main_11 T = new Main_11();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		int[][] arr = new int[n + 1][6];

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= 5; j++) {
				arr[i][j] = kb.nextInt();
			}
		}

		System.out.print(T.solution(n, arr));

	}
}
