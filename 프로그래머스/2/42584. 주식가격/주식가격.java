import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
       int n = prices.length;
        int[] answer = new int[n];
        
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        for(int i =1;i<n;i++){
            while(!stack.isEmpty()&&prices[i]<prices[stack.peek()]){//주식 값이 떨어졌다.
                int temp= stack.pop();
                answer[temp]=i-temp;
            } 
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int temp= stack.pop();
            answer[temp] = n-1-temp;
        }
        
        
        
        
        
        return answer;
    }
}