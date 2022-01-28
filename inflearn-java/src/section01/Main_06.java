package section01;

import java.util.*;

/* 6. 중복문자제거
 */

class Main_06 {	
	
	public String solution(String str){
		
		String answer = "";
		
		for(int i = 0; i < str.length(); i++){
			//System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			
			// 처음으로 i가 발견된 인덱스 == 현재 i의 인덱스 (중복 문자가 아니라면)
			if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
		}
		return answer;
	}

	public static void main(String[] args){
		
		Main_06 T = new Main_06();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution(str));
		
	}
	
}