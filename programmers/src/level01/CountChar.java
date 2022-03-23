package level01;

class CountChar {
    boolean solution(String s) {
    
    // 1. 모두 대문자로 바꾸고 시작
    s = s.toUpperCase();

    int pcnt = 0, ycnt = 0;

    // 2. P, Y 하나도 포함하지 않는 경우는 true
    if(!s.contains("P") && !s.contains("Y")) {
        return true;
    }

    // 3. pcnt, ycnt 구하기
    for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == 'P') pcnt++;
        else if(s.charAt(i) == 'Y') ycnt++;
    }
    
    // 4. 둘의 개수가 같으면 true, 다르면 false 리턴하기
    return (pcnt == ycnt ? true : false);

    }
}