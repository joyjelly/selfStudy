import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
       for(int i =0; i<arr.length;i++){
           if(arr[i]==2){
               list.add(i);
           }
       }
        if(list.size()==1){
            return new int[]{arr[list.get(0)]};
        }else if(list.isEmpty()){
            return new int[]{-1};
        }
        int s = list.stream().mapToInt(Integer::intValue).min().getAsInt();
        int e = list.stream().mapToInt(Integer::intValue).max().getAsInt();
        int[] answer = new int[e-s+1];
        for(int i=s;i<=e;i++ ){
            answer[i-s] = arr[i];
        }
        
        return answer;
    }
}