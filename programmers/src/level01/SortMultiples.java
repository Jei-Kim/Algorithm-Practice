import java.util.ArrayList;
import java.util.Collections;

class SortMultiples {
    public ArrayList<Integer> solution(int[] arr, int divisor) { //반환타입 변경해줌

    // 1. n으로 나누어 떨어지는 수를 담은 리스트 만들기
    ArrayList<Integer> list = new ArrayList<Integer>();

    for(int i = 0; i < arr.length; i++) {
        if(arr[i] % n == 0) list.add(i);
    }

    // 2. 나누어 떨어지는 수 없을 경우 -1 리턴
    if(list.isEmpty()) list.add(-1);

    // 3. 그 외에는 오름차순으로 정렬 후 리턴
    Collections.sort(list);
    return list;
    
    }
}