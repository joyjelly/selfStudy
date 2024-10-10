import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        //n번째 이후 + n번째 이전
        
        int[] temp1 = Arrays.copyOfRange(num_list,n,num_list.length);
        int[] temp2 = Arrays.copyOfRange(num_list,0,n);
        
        List<Integer> list = new ArrayList<>();
        for(int temp: temp1){
            list.add(temp);
        }
        for(int temp: temp2){
            list.add(temp);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}