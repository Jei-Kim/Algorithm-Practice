package section04;
import java.util.*;

/*
2. 아나그램(해쉬)
길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세
요. 아나그램 판별시 대소문자가 구분됩니다.
*/

class Main_02 {	
	public String solution(String s1, String s2){
		String answer="YES";
		HashMap<Character, Integer> map=new HashMap<>();
		for(char x : s1.toCharArray()){
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		for(char x : s2.toCharArray()){
			if(!map.containsKey(x) || map.get(x)==0) return "NO";
			map.put(x, map.get(x)-1); 
		}
		return answer;
	}

	public static void main(String[] args){
		Main_02 T = new Main_02();
		Scanner kb = new Scanner(System.in);
		String a=kb.next();
		String b=kb.next();
		System.out.print(T.solution(a, b));
	}
}