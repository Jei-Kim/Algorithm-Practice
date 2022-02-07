import java.util.ArrayList;
import java.util.Collections;

class SortMultiples {
    public ArrayList<Integer> solution(int[] arr, int divisor) { //반환타입 변경해줌

    int n = divisor;
    ArrayList<Integer> list = ArrayList<Integer>();

    for(i = 0; i < arr.length; i++) {
        if(arr[i] % n == 0) list.add(arr[i]);
    }

    if(list.isEmpty()) list.add(-1);
    Collections.sort(list);
    return list;
    }
}