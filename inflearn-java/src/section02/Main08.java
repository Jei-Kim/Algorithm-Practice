package section02;

import java.util.*;

class Main08 {	
	
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
		
		Main08 T = new Main08();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}