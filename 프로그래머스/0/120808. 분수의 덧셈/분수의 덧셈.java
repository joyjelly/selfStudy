public class Solution {
    
    // 최대공약수(GCD)를 계산하는 함수
    private static int gcd(int a, int b) {
        // b가 0이 될 때까지 반복하여 a와 b의 나머지를 구합니다.
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        // 최대공약수를 반환합니다.
        return a;
    }

    // 최소공배수(LCM)를 계산하는 함수
    private static int lcm(int a, int b) {
        // 최소공배수는 a와 b의 곱을 a와 b의 최대공약수로 나눈 값입니다.
        return a * (b / gcd(a, b));
    }

    // 두 분수를 더하고 기약 분수로 만드는 함수
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 공통 분모를 계산합니다.
        int commonDenominator = lcm(denom1, denom2);
        
        // 각 분수를 공통 분모로 변환하여 분자 합을 계산합니다.
        int numeratorSum = (numer1 * (commonDenominator / denom1)) + (numer2 * (commonDenominator / denom2));
        
        // 분자 합과 공통 분모의 최대공약수를 구합니다.
        int gcd = gcd(numeratorSum, commonDenominator);
        
        // 최대공약수로 분자와 분모를 나누어 기약 분수로 만듭니다.
        int finalNumerator = numeratorSum / gcd;
        int finalDenominator = commonDenominator / gcd;
        
        // 결과를 배열로 반환합니다.
        return new int[] { finalNumerator, finalDenominator };
    }

    public static void main(String[] args) {
        // 테스트 예제
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;
        
        // 두 분수를 더한 결과를 기약 분수로 반환합니다.
        int[] result = solution(numer1, denom1, numer2, denom2);
        
        // 결과 출력
        System.out.println("Result: " + result[0] + "/" + result[1]);  // 예상 출력: Result: 5/4
    }
}
