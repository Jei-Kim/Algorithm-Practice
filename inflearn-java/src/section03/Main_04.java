package section03;
import java.util.*;

/*
4. 연속 부분수열
N개의 수로 이루어진 수열이 주어집니다.
이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을
작성
*/

class Main_04 {	
	public int solution(int n, int m, int[] arr){
		int answer=0, sum=0, lt=0;
		for(int rt=0; rt<n; rt++){
			sum+=arr[rt];
			if(sum==m) answer++;
			while(sum>=m){
				sum-=arr[lt++];
				if(sum==m) answer++; 
			}
		}
		return answer;
	}

	public static void main(String[] args){

		Main_04 T = new Main_04();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int[] arr=new int[n];

		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
        
		System.out.print(T.solution(n, m, arr));
	}
}