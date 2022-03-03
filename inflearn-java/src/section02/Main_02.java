package section02;

import java.util.*;

/* 2. 보이는 학생 
- 맨 앞에서 볼 때  보이는 학생의 수 구하기
- (앞사람보다 작으면 안보인다는 조건)
*/

public class Main_02 {

	public int solution(int n, int[] arr) {

		int answer = 1, max = arr[0];

		for (int i = 1; i < n; i++) {

			if (arr[i] > max) {
				max = arr[i];
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		Main_02 T = new Main_02();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.print(T.solution(n, arr));
	}
}
