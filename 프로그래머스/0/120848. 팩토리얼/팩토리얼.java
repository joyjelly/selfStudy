class Solution {
    public int solution(int n) {
        int i = 1;
        int factorial = 1;
        
        while (true) {
            if (factorial > n) {
                return i - 1;
            }
            i++;
            factorial *= i;
        }
    }
}
