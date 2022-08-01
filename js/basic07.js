/* 7. switch */

let fruit = prompt('무슨 과일을 사고 싶나요?');

//break가 없으면 첫 번째 조건이라도 다음 조건문 모두 실행 - break문 꼭 넣어 줘야 함
switch (fruit) {
    case '사과': console.log('100원 입니다.');
        break;
    case '바나나': console.log('200원 입니다.');
        break;
    case '딸기': console.log('300원 입니다.');
        break;
    default: //예외처리
        console.log('올바른 과일명을 입력해주세요.')
}