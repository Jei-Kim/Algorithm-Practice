import java.util.*;

class StringDesc {
    public String solution(String s) {
        
       String answer = "";

        // 1. 한글자씩 나눠서 배열에 담아주기 + 정렬
        String arr[] = s.split("");
        Arrays.sort(arr);

        // 2. 배열 리스트화 + 뒤집기
        Collections.reverse(Arrays.asList(arr));

        // 3. 배열 스트링화 + 리턴
        return String.join("",arr);
    }
}