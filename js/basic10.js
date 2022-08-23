/* 10. 객체(Object) */

//객체
const superman = {
    name: 'clark',
    age: 30,
}
console.log(superman);

//추가(.이나 []사용)
superman.hairColor = 'black';
superman['hobby'] - 'football';
console.log(superman);


//삭제
delete superman.age;
console.log(superman);

// 객체 반환 함수
function makeObject(name, age) {
    return {
        name: name,
        age: age,
        hobby: 'football'
    }
}
const Mike = makeObject('Mike', 30);
console.log(Mike);

//in - 프로퍼티가 존재하는지 확인
console.log('age' in Mike); //true
console.log('birthday' in Mike); //false

//객체 in
function isAdult(user) {
    if (!('age' in user) || //user에 age가 없거나
        user.age < 20) { // 20살 미만이면 {
        return false; //false
    }
    return true;
}

const User1 = {
    name: "Mike",
    age: 30
};

const User2 = {
    name: "Jane"
}

console.log(isAdult(User2));

// 객체 for..in

const Abby = {
    name: Abby,
    age: 30
};

for (x in Abby) { //key는 객체의 프로퍼티를 의미, x 등 임의의 문자로 변경 가능
    console.log(x); // name, age 출력
    console.log(Abby[x]); // "Abby", 30 출력
}