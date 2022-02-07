class CountChar {
    boolean solution(String s) {
    
    s = s.toUpperCase();
    int pcnt = 0, ycnt = 0;

    if(!s.contains("P") && !s.contains("Y")) return true;

    for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == 'P') pcnt++;
        else if(s.charAt(i) == 'Y') ycnt++;
    }

    //처음 풀이
    if(pcnt == ycnt) return true;
    return false;

    //삼항연산자 이용 풀이
    //return (pcnt == ycnt ? true : false); 

    }
}