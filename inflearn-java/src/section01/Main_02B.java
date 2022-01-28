package section01;

import java.util.*;

/* 2. 대소문자 변환 - 아스키 문자 활용 */

class Main_02B {	
	
	public String solution(String str){
		
		String answer="";
		
		for(char x : str.toCharArray()){
			if(x>=97 && x<=122) answer += (char)(x-32); // 형 변환 주의 
			else answer += (char)(x+32);
		}
		
		return answer;
	}

	public static void main(String[] args){
		
		Main_02B T = new Main_02B();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		
		System.out.print(T.solution(str));
	}
}