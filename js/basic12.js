/* 12. 배열 - Array */
// 배열은 함수도 포함할 수 있음
// 배열이 가지고 있는 메서드 활용하기

// array

let days = ["mon", "tue", "wed"];

days.push("thu"); //목요일 추가(맨뒤)
days.unshift("sun"); //일요일 추가(맨앞)

for (let index = 0; index < days.length; index++) {
    console.log(days[index]);
} // sun~thu 출력

//for of 사용
for (let x of days) {
    console.log(x);
}// 동일하게 sun~thu 출력
