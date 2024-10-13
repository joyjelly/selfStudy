import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(String temp: strArr){
            map.put(temp.length(),map.getOrDefault(temp.length(),0)+1);
        }
        Set<Integer> set = map.keySet();
        
        for(int values: set){
            
            answer = Math.max(answer,map.get(values));
        }
        
        return answer;
    }
}