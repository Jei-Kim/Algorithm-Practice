/* 6. 반복문 */
// 보통 명확한 횟수가 정해져있으면 for, 아니면 while을 사용

//for
for (let i = 0; i < 10; i++) {
    //반복할 코드
    console.log(i + 1)
}

//while
let i = 0;
while (i < 10) {
    console.log(i);
    i++;
}

//break
while (true) {
    let answer = confrm("계속할까요?");
    if (!answer) {
        break;
    }
}

//continue로 짝수만 출력
for (let i = 0; i < 10; i++) {
    if (i % 2) { //나머지가 2가 아니면 continue를 만나지 못하고 다음으로 넘어가 출력문
        continue;
    }
    console.log(i);
}