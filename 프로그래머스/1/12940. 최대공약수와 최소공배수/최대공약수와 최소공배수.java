public class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGCD(n, m); // 최대공약수 구하기
        int lcm = (n * m) / gcd; // 최소공배수 구하기
        return new int[]{gcd, lcm};
    }

    // 유클리드 호제법을 이용한 최대공약수(GCD) 구하기
    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
