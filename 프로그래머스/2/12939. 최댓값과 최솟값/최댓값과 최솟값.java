import java.util.*;

class Solution {
    public String solution(String s) {
       
        
        String[] sArray = s.split(" ");
        int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
        for(int i =0; i<sArray.length;i++){
            int temp = Integer.parseInt(sArray[i]);
            min = Math.min(min,temp);
            max = Math.max(max,temp);
            
        }
        
         String answer = min+" "+max;
        
        
        return answer;
    }
}