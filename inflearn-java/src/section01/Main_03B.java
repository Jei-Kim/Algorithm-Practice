package section01;

import java.util.*;

/* 3. 문장 속 단어 (indexOf, substring) 
 * - 문장 속에서 가장 긴 단어 찾아 출력하기 
 */

class Main_03B {
	
	public String solution(String str){
		
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
		 
		while((pos = str.indexOf(' ')) != -1) { // 띄어쓰기 발견 시 인덱스 번호 리턴, 발견 못 하면 -1 리턴
			
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			
			if(len > m){ //>= 아님 주의 (동일한 길이 발견 시 앞쪽 단어 정답으로 간주하기 위해) 
				m = len;
				answer = tmp;
			}
			
			str=str.substring(pos+1);
		}
		
		if(str.length() > m) answer = str; // 마지막 단어 처리 (필수) 
		
		return answer;
	}

	public static void main(String[] args){
		
		Main_03B T = new Main_03B();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		
		System.out.print(T.solution(str));
	}
}