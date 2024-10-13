import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("a|b|c");
        List<String> list = new ArrayList<>();
        for(String temp:answer){
            if(!temp.equals("")){
                list.add(temp);
            }
        }
        
        if(list.isEmpty()){
            return new String[] {"EMPTY"};
        }
        
        
        return list.stream().toArray(String[]::new);
    }
}