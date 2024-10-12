import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int i = 1;
        while(i<len){
             i*=2;
        }
        int add = i-len;
        System.out.println(i);
        System.out.println(add);
        ArrayList<Integer>list = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
        for(int j = 0; j<add;j++){
            list.add(0);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
  
}