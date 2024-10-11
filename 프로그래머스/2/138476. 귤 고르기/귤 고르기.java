import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int temp : tangerine){
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());
        
        int temp = 0;
        int count = 0;
        for(int tans: list){
            temp+= tans;
            count++;
            if(temp>=k){
                return count;
            }
            
        }
        return answer;
  
    }
}