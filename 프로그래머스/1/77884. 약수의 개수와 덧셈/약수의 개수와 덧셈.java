class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i= left; i<=right;i++){
           int result= count(i);
            if(result%2==0){
                answer +=i;
            }else{
                answer -=i;
            }
           
        }
        
        return answer;
    }
    private static int count(int x){
        int cnt =0;
        for(int i =1;i<=x;i++){
            if(x%i==0){
                cnt++;
            }
        }
        return cnt;
    }
}