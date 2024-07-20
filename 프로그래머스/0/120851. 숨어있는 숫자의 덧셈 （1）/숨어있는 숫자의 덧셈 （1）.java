import java.util.*;
class Solution {
    public int solution(String my_string) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i =0; i<my_string.length();i++){
            Character ch = my_string.charAt(i);
            if(Character.isDigit(ch)){
                list.add(ch - '0');
            }
        }
        int answer = 0;
        for(int j=0;j<list.size();j++){
            answer+= list.get(j);
        }
        
        
    
        
        return answer;
    }
}