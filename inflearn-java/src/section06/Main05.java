package section06;
import java.util.*;

class Main05 {	
	public String solution(int n, int[] arr){
		String answer="U";
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++){
			if(arr[i]==arr[i+1]){
				answer="D";
				break;
			}
		}
		return answer;
	}
	public static void main(String[] args){
		Main05 T = new Main05();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		System.out.println(T.solution(n, arr));
	}
}