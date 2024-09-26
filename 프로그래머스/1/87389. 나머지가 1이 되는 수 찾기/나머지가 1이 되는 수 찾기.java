class Solution {
    public int solution(int n) {
        int answer = 1000001;
        for (int i =n-1;i>=2;i--){
            if(n%i==1){
                answer = Math.min(answer,i);
            }
        }
        return answer;
    }
}