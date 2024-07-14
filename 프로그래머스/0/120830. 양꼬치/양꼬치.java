class Solution {
    public int solution(int n, int k) {
        int plus =0;
         int answer = 0;
        plus = n/10;
        // n/10 만큼 k에서 마이너스를 해야함.
        if(plus>=0){
           answer= (n*12000)+(k-plus)*2000;
        }else{
             answer= (n*12000)+(k*2000);
        }
      
       
        return answer;
    }
}