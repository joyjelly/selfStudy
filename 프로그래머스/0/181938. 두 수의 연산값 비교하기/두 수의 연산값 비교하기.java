class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int plus=Integer.parseInt(""+a+b);
        int mult = 2*a*b;
        if(mult>plus){
            answer =mult;
        }else{
            answer =plus;
        }
        return answer;
    }
}