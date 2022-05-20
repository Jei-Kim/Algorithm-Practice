package section03;

import java.util.*;

/* 1. 두 배열 합치기
- 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램
을 작성
*/

class Main_01 {	
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
		
        ArrayList<Integer> answer = new ArrayList<>();

		int p1=0, p2=0;

		while(p1<n && p2<m){
			if(a[p1]<b[p2]) answer.add(a[p1++]);
			else answer.add(b[p2++]);
		}
		while(p1<n) answer.add(a[p1++]);
		while(p2<m) answer.add(b[p2++]);
		return answer;
	}

	public static void main(String[] args){

		Main_01 T = new Main_01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];

		for(int i=0; i<n; i++){
			a[i] = kb.nextInt();
		}

		int m = kb.nextInt();
		int[] b = new int[m];

		for(int i=0; i<m; i++){
			b[i] = kb.nextInt();
		}
        
		for(int x : T.solution(n, m, a, b)) System.out.print(x+" ");
	}
}