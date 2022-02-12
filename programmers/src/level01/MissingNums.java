class MissingNums {
    public class solution(int[] numbers) {

        int sum = 45; //0~9까지의 합을 미리 설정

        for(int i = 0 ; i < numbers.length; i++) {
            sum -= numbers[i];
        }
        return sum;
    
        /*
        for(int n : numbers) {
            sum -= n;
        }
        return sum;
        */
    }   
}