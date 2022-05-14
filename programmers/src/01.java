import java.util.*;
 
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int first[] = {1,2,3,4,5}; //규칙 반복(이하 동일)
        int second[] = {2,1,2,3,2,4,2,5};
        int third[] = {3,3,1,1,2,2,4,4,5,5};
        
        int all[] = new int[3]; //3명 비교
        
        for(int i = 0; i < answers.length; i++){ //정답과 비교하여 맞은 것이 있다면 ++
            if(answers[i] == first[i%first.length]){all[0]++;}
            if(answers[i] == second[i%second.length]){all[1]++;}
            if(answers[i] == third[i%third.length]){all[2]++;}
        }
        
        List<Integer> clearPerson = new ArrayList<Integer>(); //List만들어주고 최대값 비교
        int max = Math.max(Math.max(all[0], all[1]),all[2]);
                
        if(max == all[0]){clearPerson.add(1);}
        if(max == all[1]){clearPerson.add(2);}
        if(max == all[2]){clearPerson.add(3);}
        
        Collections.sort(clearPerson); //가장 높은 점수를 받은 사람이 여러명일 경우 오름차순
        
        answer = new int[clearPerson.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = clearPerson.get(i);
        }
                   
        
        return answer;
    }
}
