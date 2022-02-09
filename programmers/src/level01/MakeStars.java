import java.util.Scanner;

class MakeStars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        //가로 n, 세로 m인 직사각형 별 만들기
        for (int n = 0; n < b; n++){
            for (int m = 0; m < a; m++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}