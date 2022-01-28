package section01;

import java.util.*;

/* 12. 암호 
 */

public class Main_12 {

		public String solution(int n, String s) {
			
			String answer = "";
			
			for (int i = 0; i < n; i++) {
				
				String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0'); //숫자형태의 문자열로 해석한 후, 
				int num = Integer.parseInt(tmp, 2); //실제 숫자로 바꿈 
				
				answer += (char) num; //숫자가 가리키는 문자로 바꿔서 최종 해석 
				
				s = s.substring(7);
			}
			return answer;
		}

		public static void main(String[] args) {
			
			Main_12 T = new Main_12();
			Scanner kb = new Scanner(System.in);
			int n = kb.nextInt();
			String str = kb.next();
			System.out.println(T.solution(n, str));
			
		}
	}

