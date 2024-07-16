class Solution {
    public int solution(int hp) {
        int first = 0;
        int sec =0;
        int third =0;
        first = (hp/5);
        sec = (hp%5)/3;
        third = (hp%5)%3;
        
        int answer = 0;
        answer =first+sec+third;
        return answer;
    }
}