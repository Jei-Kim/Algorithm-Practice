package section03;
import java.util.*;

/* 3. 최대 매출
- N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하기
*/

class Main_03 {	
	public int solution(int n, int k, int[] arr){

		int answer, sum=0;

		for(int i=0; i<k; i++) sum+=arr[i];
		answer=sum;
        
		for(int i=k; i<n; i++){
			sum+=(arr[i]-arr[i-k]);
			answer=Math.max(answer, sum);
		}
		return answer;
	}

	public static void main(String[] args){

		Main_03 T = new Main_03();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int[] arr=new int[n];

		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}

		System.out.print(T.solution(n, k, arr));

	}
}