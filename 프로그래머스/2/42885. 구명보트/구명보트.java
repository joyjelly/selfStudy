import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        
        int i = 0;//최소
        int j =people.length-1;//최대
        
        while(i<=j){
            if(people[i]+people[j]<=limit){//최대와 최소를 태움
                
                i++;
                j--;
            }else{
                j--;//최대만 태움
            }
            answer++;
            
        }
        
        
        return answer;
    }
}