package section01;

import java.util.*;

/* 3. 문장 속 단어 
 * - 문장 속에서 가장 긴 단어 찾아 출력하기 
 */

class Main_03A {	
	
	public String solution(String str){
		
		String answer = "";
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" "); // " "를 기준으로 문자열을 나누어서 배열에 저장 
		
		for(String x : s){
			int len = x.length();
			
			/* 최대값 구하기 */
			if(len > m){
				m = len;
				answer = x;
			}
		}
		return answer;
	}

	public static void main(String[] args){
		
		Main_03A T = new Main_03A();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		System.out.print(T.solution(str));
	}
}
