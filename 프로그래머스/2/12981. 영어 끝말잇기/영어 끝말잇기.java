import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[]{0,0};
    Set<String> set = new HashSet<String>();
        char prev = words[0].charAt(0);//시작단어
        
        for(int i = 0 ; i<words.length;i++){
            if(set.contains(words[i])||prev!=words[i].charAt(0)){
                return new int[]{i%n+1,i/n+1};
            }
            
            set.add(words[i]);
            prev =words[i].charAt(words[i].length()-1);//시작단어 리셋
            
            
        }
        
        

        return answer;
    }
}