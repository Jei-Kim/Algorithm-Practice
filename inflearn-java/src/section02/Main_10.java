package section02;
import java.util.*;

/* 10. 봉우리
* - 격자판에서 상하좌우에 있는 숫자보다 큰 숫자(봉우리 지역) 찾아 개수 출력
*/

public class Main_10 {
	
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		
		public int solution(int n, int[][] arr){
			
			int answer = 0;
			
			for(int i = 0; i < n; i++){
				
				for(int j = 0; j < n; j++){
					boolean flag = true;

					for(int k = 0; k < 4; k++){	
						int nx = i + dx[k];
						int ny = j + dy[k];
						
						// 경계(0) 처리(조건문 순서 주의)
						if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]){
							flag = false;
							break;
						}
					}
					if(flag) answer++;
				}
			}
			return answer;
		}

		public static void main(String[] args){
			
			Main_10 T = new Main_10();
			Scanner kb = new Scanner(System.in);
			
			int n = kb.nextInt();
			int[][] arr = new int[n][n];
			
			for(int i = 0; i < n; i++){
				
				for(int j = 0; j < n; j++){
					
					arr[i][j] = kb.nextInt();
				}
			}
			
			System.out.print(T.solution(n, arr));
		}
	}

