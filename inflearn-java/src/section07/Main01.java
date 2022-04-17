package section07;
import java.util.*;

class Main01 {
	public void DFS(int n){
		if(n==0) return;
		else{
			DFS(n-1);
			System.out.print(n+" ");
		}
	}

	public void solution(int n){
		DFS(n);
	}
	public static void main(String[] args){
		Main01 T = new Main01();
		T.solution(3);
		//System.out.println(T.solution(3));
	}	
}