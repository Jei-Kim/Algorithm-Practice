package section01;

import java.util.*;
class Main_03A {	
	public String solution(String str){
		String answer="";
		int m=Integer.MIN_VALUE;
		String[] s = str.split(" ");
		for(String x : s){
			int len=x.length();
			if(len>m){
				m=len;
				answer=x;
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
