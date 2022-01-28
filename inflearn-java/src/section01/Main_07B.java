package section01;

import java.util.*;

/* 7. 회문문자열
 * - 앞에서 읽을 때나, 뒤에서 읽을 때나 같은 문자열 찾기 
 */

class Main_07B {	
	
	public String solution(String str){
		
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		
		if(str.equalsIgnoreCase(tmp)) answer = "YES";
		return answer;
	}

	public static void main(String[] args){
		
		Main_07B T = new Main_07B();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution(str));
		
	}
}
