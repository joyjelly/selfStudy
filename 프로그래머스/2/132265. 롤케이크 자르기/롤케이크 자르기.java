import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer,Integer> toppings = new HashMap<>();
        //먼저 토핑을 맵 하나에 전부 넣고
        for(int temp :topping){
            toppings.put(temp, toppings.getOrDefault(temp,0)+1);
        }
        //비교 할 맵을 생성하고
         Map<Integer,Integer> compare = new HashMap<>();
        //토핑을 하나씩 돌리면서 -> 두번째 맵에 넣고 첫번째 맵에서 빼!
         for(int temp :topping){
            compare.put(temp, compare.getOrDefault(temp,0)+1);
            toppings.put(temp,toppings.get(temp)-1);
             
             if(toppings.get(temp)==0){
                 toppings.remove(temp);
             }
             if(toppings.size()==compare.size()){
                 answer++;
             }
        }
        return answer;
    }
}