package section01;

import java.util.*;

/* 7. 회문문자열
 * - 앞에서 읽을 때나, 뒤에서 읽을 때나 같은 문자열 찾기 
 */

class Main_07A {	
	
	public String solution(String str){
		String answer = "YES";
		str = str.toUpperCase();
		int len = str.length();
		
		for(int i = 0; i < len/2; i++){ //홀짝 동일한 로직 
			
			if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
		}
		return answer;
	}

	public static void main(String[] args){
		
		Main_07A T = new Main_07A();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution(str));
		
	}
}



