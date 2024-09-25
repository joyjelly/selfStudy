import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int n = s.length();
        s +=s;
        
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        
        for(int i =0;i<n;i++){//시작부터~끝
          Stack<Character> stack  = new Stack<>();
            boolean flag = true;
            for(int j = i; j<n+i;j++){
                char c = s.charAt(j);
                
                if(!map.containsKey(c)){ //키를 가지고있지 않다 == 열리는 괄호다
                     stack.push(c);
                    
                }else{ //닫히는 괄호인데~
                    //스택이 비거나? 짝이 안 맞으면 다시 처음으로 돌아갓!
                    if(stack.isEmpty()|| !map.get(c).equals(stack.pop())){
                        flag= false;
                        break;
                    }                    
                }                              
            }
              if(flag&&stack.isEmpty()){
                answer++;
        }
            }
      
        
        
        
        
        return answer;
    }
}