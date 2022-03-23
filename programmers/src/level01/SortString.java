package level01;
import java.util.*;

class SortString {
    public String[] solution(String[] strings, int n) {
        
        // 1. 새로운 문자 배열 생성
        String[] answer = new String[strings.length];

        // 2. n번째 글자로 시작하는 새로운 문자열을 담을 리스트를 만든다.
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }

        // 3. 새롭게 생성된 리스트 정렬
        Collections.sort(list);

        // 4. 두번째 글자부터 끝까지 잘라서 넣기 (첫번째 글자 정렬용이라 제외)
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).subString(1);
        }

        return answer;
    }
}
