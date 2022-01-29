package section02;

import java.util.*;

/* 4. 피보나치 수열
 * 
 */

public class Main_04B {

	public void solution(int n){
		
		int a=1, b=1, c;
		System.out.print(a+" "+b+" ");
		
		for(int i=2; i<n; i++){
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
	}
	
	public static void main(String[] args){
		
		Main_04B T = new Main_04B();
		Scanner kb = new Scanner(System.in);
		
		int n=kb.nextInt();
		
		T.solution(n);
	}
	
}
