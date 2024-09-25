import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
    //문자열 잘라서 스택에 넣기
        char[] arr = s.toCharArray();
  for(int i = 0; i<arr.length;i++){
      if(arr[i]=='('){
          stack.push(arr[i]);
      }else{ //닫는 괄호라면?
          //빈 스택이라면 바로 리턴
          if(stack.isEmpty()){
              return false;
          }
          //빈스택이 아니
          if(stack.peek()!='('){
              return false;
              
          }else{
              stack.pop();
          }
      }
  }
    
    if(!stack.isEmpty()){
        return false;
    }
      
        return answer;
    }
}