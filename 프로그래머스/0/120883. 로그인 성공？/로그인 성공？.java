import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "wrong pw";
        Map<String,String> map = new HashMap<String,String>();
        for(int i =0;i<db.length;i++){
            map.put(db[i][0],db[i][1]);
        }
        for(int i =0; i<map.size();i++){
            if(map.containsKey(id_pw[0])){
                if(map.get(id_pw[0]).equals(id_pw[1])){
                    answer ="login";
                }
            }else{
                answer ="fail";
            }      
        }
        
        return answer;
    }
}