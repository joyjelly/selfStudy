import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<len;i++){
            list.add(num_list[len-1-i]);
        }
        
        
        int[] answer = new int[len];
        for(int j =0;j<len;j++){
            answer[j] = list.get(j);
        }
        return answer;
    }
}