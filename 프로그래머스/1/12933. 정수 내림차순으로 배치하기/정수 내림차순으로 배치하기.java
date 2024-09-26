import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        List<Long> list = new ArrayList<>();
        
        while(n>0){
            list.add(n%10);
            n/=10;
        }
        
        Collections.sort(list,Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(long x: list){
            sb.append(x);
        }
        
        
        
        return Long.parseLong(sb.toString());
    }
}