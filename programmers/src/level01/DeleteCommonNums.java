package level01;
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
    
    // 1. 임시로 담아 놓을 리스트 선언
    ArrayList<Integer> tempList = new ArrayList<Integer>();

    // 2. preNum과 같지 않을 경우 임시리스트에 추가 + preNum 초기화
    int preNum = -1;
    for(int n : arr) {
        if(preNum != n) {
            tempList.add(n);
            preNum = n;
        }
    }

    // 3. 리턴할 배열 선언
    int []answer = new int[tempList.size()];

    // 4. 배열에 리스트 원소 넣어서 리턴
    for(int i = 0; i < answer.length; i++) {
        answer[i] = tempList.get(i).intValue();
    }

    return answer;
    }
}