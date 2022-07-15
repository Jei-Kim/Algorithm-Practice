/* 5. 논리 연산자(|| && !) */

//OR는 첫 번째 true를 발견하는 순간 평가를 멈추며, 
//AND는 첫 번째 false를 발견하는 순간 평가를 멈춤

//우선순위
// 남자이고, 이름이 mike이거나 성인이면 통과
const gender5 = 'F';
const name5 = 'Jane';
const isAdult5 = true;

//if(gender5 ==== 'M' && name5 === 'Mike' || isAdult5)//통과(and가 우선순위가 높기 때문)
if (gender5 ==== 'M' && (name5 === 'Mike' || isAdult5)) {
    console.log("통과");
} else {
    console.log("돌아가");
} //돌아가