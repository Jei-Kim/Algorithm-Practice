package section02;

import java.util.ArrayList;
import java.util.Scanner;

/* 1. 큰 수 출력하기
- 자기 앞 숫자보다 큰 수만 모아서 출력
*/

public class Main_01 {

	public ArrayList<Integer> solution(int n, int[] arr) {

		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);

		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i - 1])
				answer.add(arr[i]);
		}

		return answer;
	}

	public static void main(String[] args) {

		Main_01 T = new Main_01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		for (int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}
