/* 3. 형변환 
** 주의
- prompt로 받은 값은 문자형임 
- 나누기 등은 숫자형으로 자동 형변환이 되어 계산됨 
- but 오류 발생을 줄이기 위해 명시적 형변환이 중요 
*/

Console.log(String(3), Number("1234"))

Number(true) //1
Number(false) //0
Number(null) //0
Number(undefined)//NaN