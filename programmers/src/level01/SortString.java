package level01;

import java.util.*;

class SortString {
    public String[] solution(String[] strings, int n) {
        
        String[] answer = new String[strings.length];
        ArrayList<String> list = new ArrayList<>();

        for(ini i = 0; i < strings.length; i++) {
            list.add(strings.charAt(n) + strings[i]);
        }

        Collections.sort(list);

        for(ini i = 0; i < list.size(); i++) {
           answer[i] = list.get(i).subsring(1);
        }
        return answer;
    }
}
