class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int compare =x;
        while(compare>0){
            sum+=compare%10;
           
            compare/=10;
        }
        
        if(x%sum==0){
          
            answer = true;
        }else{
            
        }
        
        
        return answer;
    }
}