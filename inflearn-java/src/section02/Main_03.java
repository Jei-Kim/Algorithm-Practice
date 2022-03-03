package section02;

import java.util.*;

/* 3. 가위바위보 
 *  - 가위바위보 이긴 사람 출력
 */

public class Main_03 {

	public String solution(int n, int[] a, int[] b) {

		String answer = "";

	// 가위, 바위, 보 각각에 임의의 숫자 배정해서 포문 돌리기
	// 비기는 경우 고려 주의 
		for (int i = 0; i < n; i++) {
			if (a[i] == b[i])
				answer += "D";
			else if (a[i] == 1 && b[i] == 3)
				answer += "A";
			else if (a[i] == 2 && b[i] == 1)
				answer += "A";
			else if (a[i] == 3 && b[i] == 2)
				answer += "A";
			else
				answer += "B";
		}

		return answer;
	}

	public static void main(String[] args) {

		Main_03 T = new Main_03();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = kb.nextInt();
		}

		for (int i = 0; i < n; i++) {
			b[i] = kb.nextInt();
		}

		for (char x : T.solution(n, a, b).toCharArray())
			System.out.println(x);
	}
}
