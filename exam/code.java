/* 1. 데이터 입출력 */
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.printf("a*3 = %d\n", a* 3); // %d(정수)로 출력형식 지정
        System.out.println("a/2="+(a/2)); //입력 후 줄바꿈
        System.out.print("a-1="+(a-1));
        scan.close();
    }
}
/* 출력결과
a*3=12
a/2=2
a-1=3
*/

/* 2. 제어문 */
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        string str = "agile";
        int x[] = {1,2,3,4,5};
        char y[] = new char[5];
        int i = 0;
        while (i < str.length()) {
            y[i] = str.charAt(i);
            i++;
        }
        for(int p : x) {
            i--;
            System.out.print(y[i]);
            System.out.print(p+" ");
        }
    }
}
/* 출력결과
e1 l2 i3
*/

/* 3. JAVA의 클래스 */
// ex1
class ClassA {
    int a = 10;
    int funcAdd(int x, int y) {
        return x + y + a;
    }
}
public class Test {
    public static void main(String[] args) {
        int x = 3, y = 6, r;
        ClassA cal = new ClassA();
        r = cal.funcAdd(x,y);
        System.out.print(r);
    }
}
/* 출력결과
19
*/

//ex2
class ClassA {
    ClassA() {
    System.out.print('A'); //1
    this.prn();
}
void prn() {
        System.out.print('B');
    }
}
class ClassB extends ClassA {
    ClassB() {
        super();
        System.out.print('D'); //3
}
void prn() {
        System.out.print('E'); //2
    }
void prn() {
        System.out.print(x);//4
    }  
}

public class Test {
    public static void main(String[] args) {
        int x = 7;
        ClassB cal = new ClassB();
        cal.prn(x);
    }
}
/* 출력결과
AED7
*/

/* 4. JAVA의 형변환 */
abstract class Animal {
    String a = " is animal";
    abstract void look();
        void show() {
            System.out.println("Zoo");
        }
}
class Chicken extends Animal {
    Chicken() {
        look();
    }
    void look() {
        System.out.println("Chicken"+a);
    }
    void display() {
        System.out.println("two wings");
    }
}
public class Test {
    public static void main(String [] args) {
        Animal a = new Chicken();
        a.show();
    }
}
/* 출력결과
Chicken is animal
Zoo
*/