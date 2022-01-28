package section01;

import java.util.*;

/* 9. 숫자만 추출
 * - 아스키넘버 or 스트링 
 */

class Main_09 {	
	
	public int solution(String s){
		
		//int answer = 0;
		String answer = "";
		for(char x : s.toCharArray()){
			
			//if(x>=48 && x<=57) answer=answer*10+(x-48);
			
			/*if(Character.isDigit(x)){
				answer=answer*10+ Character.getNumericValue(x);
			}*/
			
			if(Character.isDigit(x)) answer += x;
		}
		return Integer.parseInt(answer);
	}

	public static void main(String[] args){
		
		Main_09 T = new Main_09();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution(str));
		
	}
}