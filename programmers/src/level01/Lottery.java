class Lottery {

    public int[] solution(int[] lottos, int[] win_nums) {

        int[] answer = new int[2];
        int[] score = {6,6,5,4,3,2,1};

        int zero_count = 0, min = 0;

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0){
                zero_count++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++){
                if (win_nums[j] == lottos[i]){
                    min++;
                    break;
                }
            }
        }
        answer[0] = score[zero_count + min]; //최고 순위
        answer[1] = score[min]; //최저 순위

        return answer;
    }
}
