package section04;
import java.util.*;

/*
4. 모든 아나그램 찾기(해쉬, 투포인터, 슬라이딩 윈도우)
- S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수 구하기
*/

class Main_04 {	
	public int solution(String a, String b){
		int answer=0;
		HashMap<Character, Integer> am=new HashMap<>();
		HashMap<Character, Integer> bm=new HashMap<>();
		for(char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0)+1);
		int L=b.length()-1;
		for(int i=0; i<L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
		int lt=0;
		for(int rt=L; rt<a.length(); rt++){
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
			if(am.equals(bm)) answer++;
			am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
			if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
			lt++;
		}
		return answer;
	}
		

	public static void main(String[] args){
		Main_04 T = new Main_04();
		Scanner kb = new Scanner(System.in);
		String a=kb.next();
		String b=kb.next();
		System.out.print(T.solution(a, b));
	}
}