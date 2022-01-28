package section01;
import java.util.*;

/* 8. 유효한 팰린드롬
 */

public class Main_08 {
	
		public String solution(String s){
			
			String answer="NO";
			
			s = s.toUpperCase().replaceAll("[^A-Z]", ""); // 대문자 A부터Z까지가 아닌 것들은 모두 ""로 대체 
			
			String tmp = new StringBuilder(s).reverse().toString();
			
			if(s.equals(tmp)) answer="YES";
			return answer;
		}

		public static void main(String[] args){
			Main_08 T = new Main_08();
			Scanner kb = new Scanner(System.in);
			String str=kb.nextLine();
			System.out.print(T.solution(str));
		
	}
	
}
