package level01;

class CommonDivisorAndMultiple {
    public int[] solution(int n, int m) {

        // 1. 주어진 두 수의 크기 판별
        int a = Math.min(n, m);
        int b = Math.max(n,m);

        // 2. 최대공약수: 유클리드 호제법 (a > b일 때 성립)
        while(b > 0) {
            int rest = a % b;
            a = b;
            b = rest;
        }

        // 3. 최소공배수: (두 수의 곱 / 최대공약수)
        return new int[] {a, n*m / a};
    }
}
