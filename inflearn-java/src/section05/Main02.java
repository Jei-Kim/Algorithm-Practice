package section05;
import java.util.*;

class Main02 {	
	public String solution(String str){
		String answer="";
		Stack<Character> stack=new Stack<>();
		for(char x : str.toCharArray()){
			if(x==')'){
				while(stack.pop()!='(');
			}
			else stack.push(x);
		}
		for(int i=0; i<stack.size(); i++) answer+=stack.get(i);
		return answer;
	}

	public static void main(String[] args){
		Main02 T = new Main02();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}
}