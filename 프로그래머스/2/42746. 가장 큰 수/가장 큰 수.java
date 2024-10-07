import java.util.*;
class Solution {
    public String solution(int[] numbers) {
      
        String[] arr = Arrays.stream(numbers)
            .mapToObj(String::valueOf)
            .toArray(String[]::new);
        
        Arrays.sort(arr,(o1,o2) ->(o2+o1).compareTo(o1+o2));
        StringBuilder sb = new StringBuilder();
        for(String temp:arr){
            sb.append(temp);
        }
    
        if (sb.toString().charAt(0) == '0') {
            return "0";
        }
        
        return sb.toString();
    }
}