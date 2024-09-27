import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> ppl1 = new HashMap<>();
        //완주 한 사람들을 먼저 넣고
        for(String person:completion){
            ppl1.put(person,ppl1.getOrDefault(person,0)+1);
           
        }
        
        for(String person:participant){
        if(ppl1.getOrDefault(person,0)==0){
            return person;
        }
            ppl1.put(person,ppl1.get(person)-1);
           
        }
      
        
        
        return answer;
    }
}