import java.util.*;

class StringDesc {
    public String solution(String s) {
        
       String answer = "";
       String arr[] = s.split("");
       Arrays.sort(arr);
       Collections.reverse(Arrays.asList(arr));

        return String.join("",arr);
    }
}