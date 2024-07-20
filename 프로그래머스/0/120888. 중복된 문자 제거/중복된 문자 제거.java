import java.util.*;
class Solution {
    public String solution(String my_string) {
        
        StringBuilder sb = new StringBuilder();
        String[] temp =my_string.split("");
        Set<String> set = new LinkedHashSet<String>();
        for(int i=0;i <temp.length;i++){
            set.add(temp[i]);
        }
        for(String str : set){
            sb.append(str);
        }
        
        
        return sb.toString();
    }
}