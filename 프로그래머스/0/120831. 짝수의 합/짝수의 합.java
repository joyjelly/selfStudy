class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i += 2) {  // 2부터 n까지 2씩 증가하는 반복문
            answer += i;  // 짝수를 더함
        }
        return answer;
    }
}
