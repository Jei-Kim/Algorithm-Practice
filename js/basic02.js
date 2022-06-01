/* 2. 대화상자 */

//prompt & alert
const userName = prompt("이름을 입력하세요."); //사용자가 입력
alert("환영합니다, " + userName + "님"); //확인 버튼 only

//prompt는 두 개의 인수를 받을 수 있음(입력값, 기본값)
const resDate = prompt("예약일을 입력하세요.", "2020-10-");

//confirm 
const isAdult = confirm("당신은 성인입니까?"); // 확인+취소 버튼
console.log(isAdult); //확인 시 true, 취소 시 false 출력

