import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<Integer>();
         
        for(int i =0; i< my_string.length();i++){
            char ch = my_string.charAt(i);
            if(Character.isDigit(ch)){
                list.add(ch-'0');
            }
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        int i =0;
        for(int temp : list){
            answer[i] = temp;
            i++;
        }
        return answer;
    }
}