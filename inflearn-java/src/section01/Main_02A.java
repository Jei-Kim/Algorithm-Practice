package section01;

import java.util.*;

class Main_02A {	
	public String solution(String str){
		String answer="";
		for(char x : str.toCharArray()){
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else answer+=Character.toLowerCase(x);

		}
		return answer;
	}

	public static void main(String[] args){
		Main_02A T = new Main_02A();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution(str));
	}
}
