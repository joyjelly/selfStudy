import java.util.*;
class Solution {
    public int solution(String s) {
        Map<String,Integer> map = new HashMap<>();
        map.put("zero",0);
         map.put("one",1);
         map.put("two",2);
         map.put("three",3);
         map.put("four",4);
         map.put("five",5);
         map.put("six",6);
         map.put("seven",7);
         map.put("eight",8);
         map.put("nine",9);
        
        
        int answer = 0;
        String temp = "";
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){//숫자라면
                if(temp.length()>0){//근데 앞에 붙은 temp값이 있으면?
                    sb.append(map.get(temp));
                    temp ="";
                }
                sb.append(c);
                
            }else{//문자라면
                //근데 이 temp가완성된 단어라면
                if(map.containsKey(temp)){
                     sb.append(map.get(temp));
                    temp ="";
                }
                temp += c;
            }
            
        }
        if(temp.length()>0){//근데 앞에 붙은 temp값이 있으면?
                    sb.append(map.get(temp));
        }
        return Integer.parseInt(sb.toString());
    }
}