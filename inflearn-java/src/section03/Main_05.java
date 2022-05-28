package section03;
import java.util.*;

/*
5. 연속된 자연수의 합
N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는
방법의 가짓수를 출력하는 프로그램을 작성
*/

class Main_05 {	
	public int solution(int n){
		int answer=0, sum=0;
		int m=n/2+1;
		int[] arr=new int[m];
		for(int i=0; i<m; i++) arr[i]=i+1;
		int lt=0;
		for(int rt=0; rt<m; rt++){
			sum+=arr[rt];
			if(sum==n) answer++;
			while(sum>=n){
				sum-=arr[lt++];
				if(sum==n) answer++; 
			}
		}
		return answer;
	}

	public static void main(String[] args){
		Main_05 T = new Main_05();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		System.out.print(T.solution(n));
	}
}