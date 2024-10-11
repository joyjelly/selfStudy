import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        
        for(String temp : strArr){
            if(!temp.contains("ad")){
                list.add(temp);
            }
        }
        
        return list.stream().toArray(String[]::new);
    }
}