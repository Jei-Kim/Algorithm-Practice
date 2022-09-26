/* 1. 데이터 입출력 */
#include <studio.h>
main()
{
    int i, j, k;
    scanf("%d %d", &i, &j); //%d는 10진수 의미
    k = i + j;
    printf("%d\n", k);
}
/* 출력결과
- 6, 4가 입력값일 경우 10 출력
*/

/* 2. 제어문 */
#include <studio.h>
main()
{
    int score[] = {86, 53, 95, 76, 61};
    char grade;
    char str[] = "Rank";
    for(int i = 0; i < 5; i++){
        switch (score[i] / 10) {
            case 10;
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default : grade = 'F';
        }
        if (grade != 'F')
        printf("%d is %c %s\n", i+1, grade, str); //c는 char의미
    }
}
/* 출력결과
1 is B Rank
3 is A Rank
4 is C Rank
*/

/* 3. 포인터 */
#include <studio.h>
main()
{
    int a = 50;
    //정수형 변수 a가 저장된 곳의 주소를 기억할 포인트 변수 b선언, a의 주소로 초기화 => a의 주소가 할당된 상태
    //포인터 변수 앞에는 *를 표시, 변수 앞에 번지 연산자 &을 붙이면 변수의 주소를 나타냄
    int *b = &a; 
    *b = *b + 20; //해당 주소의 값을 변경한다고 생각하기
    printf("%d, %d\n", a, *b); //70, 70
    char *s;
    s = "gilbut";
    for(int i = 0; i < 6; i += 2) {
        printf("%c, ", s[i]);
        printf("%c, ", *(s+i));
        printf("%s\n, ", s+i);
    }
}
/* 출력결과
70, 70
g, g, gilbut
*/