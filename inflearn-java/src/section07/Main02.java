package section07;
import java.util.*;

class Main02 {
	public void DFS(int n){
		if(n==0) return;
		else{
			DFS(n/2);
			System.out.print(n%2);
		}
	}

	public void solution(int n){
		DFS(n);
	}
	public static void main(String[] args){
		Main02 T = new Main02();
		T.solution(11);
		//System.out.println(T.solution(3));
	}	
}
