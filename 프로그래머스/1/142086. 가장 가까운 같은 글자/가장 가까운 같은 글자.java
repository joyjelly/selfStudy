import java.util.*;
class Solution {
    public int[] solution(String s) {
        int leng = s.length();
        int[] answer = new int[leng];
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0;i<leng;i++){
            char c= s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,i);
                answer[i] =-1;
            }else{
               
                map.put(c,i-map.get(c));
                answer[i] =map.get(c);
                 map.put(c,i);
            }
            
            
        }
        return answer;
    }
}