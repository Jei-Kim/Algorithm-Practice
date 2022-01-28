package section01;
import java.util.*;

/* 1. 문자 찾기 
 * 	- 문자열이 주어졌을 때, 대소문자 구분 없이 특정 문자열 찾는 로직  */

class Main_01 {	
	
	public int solution(String str, char t){ // 인스턴스 메서드로 생성 
		
		int answer = 0;
		
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
		//System.out.println(str + t);
		
		/*
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == t) answer++;
		}
		*/
		
		// 향상된 for문 사용 위해 str을 배열 형태로 만들기  
		for(char x : str.toCharArray()) {
			if (x == t) answer++;
		}
		return answer;
	}

	public static void main(String[] args){
		
		Main_01 T = new Main_01(); // 클래스 객체 생성 (인스턴 메서드 호출용) 
		
		Scanner kb = new Scanner(System.in); // 문자열 읽어들이기
		String str=kb.nextLine();
		char c = kb.next().charAt(0);
		System.out.print(T.solution(str, c));
	}
}