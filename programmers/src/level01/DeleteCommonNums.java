import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
    ArrayList<Integer> tempList = new ArrayList<Integer>();
    int preNum = -1; // 의미없는 수 대입해놓고

    // List에 값을 넣으면서, 넣을때마다 preNum의 수를 바꾸어 줌 
    for(int num : arr) {
        if(preNum != num) {
            tempList.add(num);
            preNum = num;
        }
    }
    int [] answer = new int[tempList.size()];

    for(int i = 0; i < answer.length; i++) {
        answer[i] = tempList.get(i).intValue();
    }

    return answer;
}
}