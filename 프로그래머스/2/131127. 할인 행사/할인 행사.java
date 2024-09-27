import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        //각각 필요한 품목과 수량을 저장한다
        Map<String,Integer> wants = new HashMap<>();
        for (int i = 0;i<want.length;i++){
            wants.put(want[i],number[i]);
        }
        //해당날짜로부터 10일간 살 수 있는 품목들을 저장한다
        for(int i =0;i<discount.length-9;i++){
          Map<String,Integer> compare = new HashMap<>();
            for(int j =i;j<i+10;j++){
                
            compare.put(discount[j],compare.getOrDefault(discount[j],0)+1);
            }
            if(wants.equals(compare)){
             answer++;
            }
        }
        
        //비교한다.
        
        
        return answer;
    }
}