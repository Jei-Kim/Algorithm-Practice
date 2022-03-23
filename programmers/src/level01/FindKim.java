package level01;

class FindKim {
    public String solution(String[] seoul) {

    String answer = "";

    // 1. 배열을 돌며 Kim의 위치를 찾아, 위치가 포함된 문장 리턴 
    for(int i = 0; i < answer.length(); i++) {
        if(seoul[i].equals("Kim"))
        answer = "김서방은" + i + " 에 있다."
    }
    return answer;
    }

    /* 다른 풀이법 */
    public String solution2(String[] seoul2) {

    int x = Arrays.asList(seoul2).indexOf("Kim");

    return "김서방은" + x + " 에 있다."
    }
}
