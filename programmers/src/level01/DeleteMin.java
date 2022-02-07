import java.util.*;

class DeleteMin {
    public int[] solution(int[] arr) {

        if(arr.length == 1) {
            arr[0] = -1;
            return arr;
        }

        int[] arr2 = arr.clone();
        Arrays.sort(arr2);

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr2.length; i++) {
            if(arr[i] > arr2[0]) list.add(arr[i]);
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
  }
}