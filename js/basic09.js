/* 9. 함수 표현식, 화살표 함수*/

//함수 표현식 -인터프리터
showError();
let showError = function () {
    console.log('error');
} // 오류 -> 함수 사용 전 선언해줘야 하기 때문

// 함수 선언문 -호이스팅
showError();
function showError() {
    console.log('error');
}

//화살표 함수
let showError = () => {
    console.log('error');
}


//화살표 함수2

//변경 전
const sayHello1 = function (name) {
    const msg = 'Hello, ${name}';
    console.log(msg);
};

//변경 후
const sayHello = (name) => {
    const msg = 'Hello, ${name}';
    console.log(msg);
};

//변경 전
const add1 = function (num1, num2) {
    const result = num1 + num2;
    return result;
}

//변경 후
const add = (num1, num2) => {
    //return num1 + num2; //return문 한줄로 줄이기
    num1 + num2; //return 생략
}

