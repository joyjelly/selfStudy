import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        Map<String,String> nickname = new HashMap<>();
        //아이디, 닉네임
        for(String temp :record){
            String[] temps=temp.split(" ");
            if(temps[0].equals("Enter")||temps[0].equals("Change"))
            nickname.put(temps[1],temps[2]);
        }
      
        List<String> list = new ArrayList<>();
        for(String command:record){
             String[] temps=command.split(" ");
            if(temps[0].equals("Enter")){
                list.add(nickname.get(temps[1])+"님이 들어왔습니다.");
            }else if(temps[0].equals("Leave")){
                 list.add(nickname.get(temps[1])+"님이 나갔습니다.");
            }
        }
        
        
        return list.stream().toArray(String[]::new);
    }
}