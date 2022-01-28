package section01;

import java.util.*;

/*	4. 단어 뒤집기 - 직접뒤집기 
 */

class Main_04B {	
	
	public ArrayList<String> solution(int n, String[] str){
		
		ArrayList<String> answer = new ArrayList<>(); 
		
		for(String x : str){
			
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length()-1;
			
			while(lt < rt){ // 뒤집어지지 않은 상태일 동안
				
				char tmp = s[lt];
				
				s[lt] = s[rt];
				s[rt] = tmp;
				
				lt++;
				rt--;
			}
			
			String tmp = String.valueOf(s); // arraylist에 넣기 위해 배열을 다시 스트링화 
			answer.add(tmp);
		}
		
		return answer;
	}

	public static void main(String[] args){
		
		Main_04B T = new Main_04B();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		
		for(int i = 0; i < n; i++){
			str[i] = kb.next();
		}
		
		for(String x : T.solution(n, str)){
			System.out.println(x);
		}
		
	}
}


