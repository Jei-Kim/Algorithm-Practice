/* 4. 비교 연산자, 조건문 */

console.log(10 > 5); //true
console.log(10 == 5); //false

//동등연산자는 값 비교, 일치 연산자는 값과 타입 모두 비교
const a1 = 1;
const b1 = "1";

console.log(a == b); //동등연산자 - true
console.log(a === b); //일치연산자 - false

//if
if (age > 18) { // if안의 조건문은 boolean형으로 변환됨
    console.log("환영합니다.")
} else {
    console.log("안녕히 가세요.");
}

