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
}
