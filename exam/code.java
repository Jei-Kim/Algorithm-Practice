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