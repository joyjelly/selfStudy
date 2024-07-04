import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int n) {
        
    
        List<Integer> list = new ArrayList<>();
        for(int i =1;i<=n;i=i+2){
            list.add(i);
        }
        int[] answer = new int[list.size()];
        for(int j =0;j<list.size();j++){
        answer[j]=list.get(j);
        }
        return answer;
    }
}