package section02;

import java.util.*;

/* 4. 피보나치 수열
 * - 앞의 2개의 수를 더해 자기자신이 되는 수열 
 */

public class Main_04A {

	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;

		for (int i = 2; i < n; i++) {
			answer[i] = answer[i - 2] + answer[i - 1];
		}

		return answer;
	}

	public static void main(String[] args) {

		Main_04A T = new Main_04A();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		for (int x : T.solution(n))
			System.out.print(x + " ");
	}
}
