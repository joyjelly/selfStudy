import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            int temp = arr[i];
            for(int j = 0;j<temp;j++){
                list.add(temp);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}