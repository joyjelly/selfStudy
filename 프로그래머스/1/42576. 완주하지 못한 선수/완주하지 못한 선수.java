import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
            HashMap<String,Integer >map1 = new HashMap<>();
     for(String temp:participant){
         map1.put(temp,map1.getOrDefault(temp,0)+1);
     }
        for(String name:completion){
            map1.put(name,map1.get(name)-1);
        }
        
        for(String names:map1.keySet()){
            if(map1.get(names) !=0){
                return names;
            }
        }
        
        return answer;
    }
}