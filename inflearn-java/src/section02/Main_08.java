package section02;
import java.util.*;

/* 8. 등수 구하기
* - 주어진 점수의 등수 구해서 출력하기
*/

class Main_08 {	
	
	public int[] solution(int n, int[] arr){
		
		int[] answer = new int[n];
		
		for(int i = 0; i < n; i++){
			int cnt = 1;
			for(int j = 0; j < arr.length; j++){
				if(arr[j]>arr[i]) cnt++;
			}
			answer[i]=cnt;
		}
		return answer;
	}
	
	public static void main(String[] args){
		
		Main_08 T = new Main_08();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}