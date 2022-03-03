package section02;

import java.util.*;

/* 5. 소수 - 에라토테네스 체
 * 
 */

public class Main_05 {

		public int solution(int n){
			
			int cnt = 0;
			int[] ch = new int[n+1]; // 배열 길이 설정 주의
			
			for(int i = 2; i <= n; i++){
				if(ch[i] == 0){
					cnt++;
					for(int j = i; j <= n; j = j + i) ch[j] = 1; // 1 제외한 약수 가지는 인덱스에 1 대입
				}
				
			}
			return cnt;
		}
		
		public static void main(String[] args){
			
			Main_05 T = new Main_05();
			Scanner kb = new Scanner(System.in);
			int n = kb.nextInt();
			System.out.println(T.solution(n));
			
		}
	}
	
