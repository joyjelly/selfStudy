import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = Arrays.stream(arr)  // IntStream 생성
        .boxed()  // 각 int 값을 Integer로 박싱
        .collect(Collectors.toCollection(ArrayList::new));
        for(int temp:delete_list){
            if(list.contains(temp)){
                list.remove((Object)temp);
            }
        }
        
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}