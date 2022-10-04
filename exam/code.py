# python의 활용
    # python은 객체지향 기능을 지원하는 스크립트 언어로, 다른 언어에 비해 문법이 간단하다는 장점
    # java, c와 기본 작성법의 차이점
        # - 변수의 자료형에 대한 선언이 없다.
        # - 문자와 문자열을 작은따옴표, 큰따옴표로 구분 없이 사용할 수 있으며, 3개의 작은 따옴표와 3개의 큰따옴표로 묶어 표현할 수 있다.
        # - 세미콜론 사용 x
        # - if나 for와 같이 코드 블록을 포함하는 명령문을 작성할 때 중괄호 대신 콜론과 여백으로 구분한다.
        
# 문제1: 
x = input('입력:' ) # xyz321
a = [ 'abc123', 'def456', 'ghi789' ]
a.append(x)
a.remove('def456')
print(a[1][-3:]), a[2][:-3], sep = ',')
for i in range(3, 6): # 마지막 값 전까지
    print(i, end = ' ') # 값 출력 후 종료문자로 '' 공백 출력 -> 반복
# 결과 => 789,xyz

# 문제2: 
a = {'apple', 'lemon', 'banana'}
a.update({ 'kiwi', 'banana'}) #새로운 요소 추가(이미 있는 요소 제외하고 추가됨)
a.remove('lemon')
a.add('apple') #새로운 요소 추가(이미 있는 요소 제외하고 추가됨)
for i in a:
    print(i)
# '''
#  결과
#  apple
#  banana
#  kiwi
#  '''

