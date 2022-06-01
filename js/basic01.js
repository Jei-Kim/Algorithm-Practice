/* 1. 자료형 */

// 변하지 않은 건 const(대문자로), 변하는 수는 let으로 선언
const name = "Mike";
let age = 30;

// c.f. 문자형은 ",',\ 으로 감싸기 가능

// 표현식 사용
const message1 = 'My name is %{name}';
console.log(message1);

const message2 = '나는 ${30+1}살 입니다.'
console.log(message2);

//문자를 숫자로 나눌 경우 NaN 반환(Not a Number)
// -> 숫자와 관련된 작업 시 NaN이 아닌지 항상 유의하며 작업해야 함
const y = name / 2;
console.log(y);

//Boolean 사용 예시
const a = true;
const b = false;

console.log(name == 'Mike'); // true
console.log(age > 40); // false

//null과 undefined
let age1;
console.log(age1); //undefined -선언만 하고 할당 x

let user = null;
console.log(user); //null은 존재하지 않는 값이라고 이해

//typeof 연산자 - 변수의 자료형을 알아내는 데 사용
console.log(typeof 3); // number 반환