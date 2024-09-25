import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
    char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        
        for( char c : arr){
            if(st.isEmpty()){
                st.push(c);
            }else{
                if(c==st.peek()){
                    st.pop();
                }else{
                    st.push(c);
                }
                
            }
            
            
        }
    if(st.isEmpty()){
                answer = 1;
            }

        return answer;
    }
}