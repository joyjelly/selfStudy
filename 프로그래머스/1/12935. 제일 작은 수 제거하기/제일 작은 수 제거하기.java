import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        
        int minValue = Arrays.stream(arr).min().getAsInt();
    List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.remove(Integer.valueOf(minValue));
        
        
        return list.size()==0? answer : list.stream().mapToInt(Integer::intValue).toArray();
    }
}