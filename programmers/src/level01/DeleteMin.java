package level01;
import java.util.*;

class DeleteMin {
    public int[] solution(int[] arr) {

        // 빈 배열이라면 -1을 채워 리턴
        if(arr.length == 1) {
            arr[0] = -1;
            return arr;
        }

        // 복사해서 정렬 후
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);

        // 리스트 생성 후,
        // 정렬된 배열의 맨 앞 인덱스보다 큰 숫자만 리스트에 넣기
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr2.length; i++) {
            if(arr[i] > arr2[0]) list.add(arr[i]);
        }
        
        // 배열 생성 후 리스트의 값 넣어주기 
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
  }
}