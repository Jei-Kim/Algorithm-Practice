class Solution {
    int numberOfPrime(int n) {
        int count = 0;
        int result = 0;

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                if ( i % j == 0) count++;
            }
            if(count == 2) result++;
            count = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution prime = new Solution();
        System.out.println( prime.numberOfPrime(10) );
    }

}
