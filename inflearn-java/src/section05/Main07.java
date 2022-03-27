package section05;
import java.util.*;

class Main07 {	

	public String solution(String need, String plan){
		String answer="YES";
		Queue<Character> Q=new LinkedList<>();

		for(char x : need.toCharArray()) Q.offer(x);
		for(char x : plan.toCharArray()){
			if(Q.contains(x)){
				if(x!=Q.poll()) return "NO";
			}
		}
		if(!Q.isEmpty()) return "NO";
		return answer;
	}
    
	public static void main(String[] args){
		Main07 T = new Main07();
		Scanner kb = new Scanner(System.in);
		String a=kb.next();
		String b=kb.next();
		System.out.println(T.solution(a, b));
	}
}