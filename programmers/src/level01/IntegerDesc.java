package level01;
import java.util.Arrays;

class IntegerDesc {
    public long solution(long n) {

        long answer = 0;
        String s = String.valueOf(n);
        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        s = new StringBuilder(new String(arr)).reverse().toString();

        answer = Long.parseLong(s);
        return answer;
    }

    public long solution2(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(String s : arr) sb.append(s);

        return Long.parseLong(sb.reverse().toString());
    }
}
