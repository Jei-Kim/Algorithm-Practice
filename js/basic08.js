/* 8. 함수(function) */
//함수의 정의 및 사용 의의는 반복 코드를 줄이는 것

//기본 예시
function sayHello0(name) {
    console.log('Hello, ${name}');
}
sayHello('Mike');

//함수 작성
function showError() {
    alert('에러가 발생했습니다. 다시 시도해주세요.');
}

showError(); // 여러곳에서 이렇게 호출을 통해 반복 사용 가능

let msg = 'Hello, ${name}'; //함수 밖에서도 사용 가능(전역 변수)
//함수 작성(매개변수o)
function sayHello(name) {
    //let msg = 'Hello, ${name}'; // 함수 내부에서만 사용 가능(지역 변수)
    console.log(msg);
}

sayHello('Kim');
sayHello('Raon');
console.log(msg);

// 전역변수와 지역변수
let msg1 = "welcome";

function sayHello(name) {
    let msg1 = "Hello"
    console.log(msg1 + ' ' + name);
}

sayHello(msg1); //함수 내 지역변수의 값 Hello 출력
console.log(msg1);//전역변수의 값 Welcome 출력
//-> 전역변수와 지역변수는 서로 간섭 x

// default
function sayHello(name = 'friend') {
    let msg = 'Hello, ${name}'
    console.log(msg)
}
sayHello(); // Hello, friend(default 출력)
sayHello('Jane'); //Hello, Jane

// return으로 값 반환
function add(num1, num2) {
    return num1 + num2;
}

const result = add(2, 3);
console.log(result); //result의 값 5 반환

// return문이 없을 경우 기본으로 undefined 반환
function showError() {
    alert('에러가 발생했습니다.')
    return; // undefined 반환, 함수를 종료하는 목적으로 이렇게 사용하기도 함
    alert('여기까지 절대 실행되지 않습니다.')
}

const result2 = showError();
console.log(result2); // undefined 반환
