/* 11. 객체 - method, this */

// 화살표 함수는 일반함수와 달리 자신만의 this를 가지지 않음 -> 외부의 this(전역객체)를 가지고 옴

//method
let boy = {
    name: "Mike",
    showName: function () {
        //console.log(boy.name); //Mike
        //console.log(this.name);
    }
};

let man = boy;
man.name = "Tom";

console.log(boy.name); //Tom
man.showName(); // Tom

//boy에 null 넣어주고 출력해보기 - this의 의의
boy = null;
man.showName(); //boy.name일 경우 오류, this.name일 경우 Mike출력됨, 화살표함수일경우 window객체를 가리킴
