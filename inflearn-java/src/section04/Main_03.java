package section04;
import java.util.*;

/*
3. 매출액의 종류
- N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별 매출액의 종
류를 출력하는 프로그램을 작성
*/

class Main_03 {	
	public ArrayList<Integer> solution(int n, int k, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> HM = new HashMap<>();
		for(int i=0; i<k-1; i++){
			HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
		}
		int lt=0;
		for(int rt=k-1; rt<n; rt++){
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt])-1);
            		if(HM.get(arr[lt])==0) HM.remove(arr[lt]);
            		lt++;
		}
		return answer;
	}

	public static void main(String[] args){
		Main_03 T = new Main_03();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		for(int x : T.solution(n, k, arr)) System.out.print(x+" ");
	}
}