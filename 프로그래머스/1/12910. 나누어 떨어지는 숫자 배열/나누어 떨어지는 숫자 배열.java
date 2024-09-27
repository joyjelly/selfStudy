import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        for(int num : arr){
            if(num%divisor==0){
                list.add(num);
            }
        }
        
        
        return list.size()==0? answer : list.stream().mapToInt(Integer::intValue).toArray();
    }
}