import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList());
        for( int temp : numlist){
            list.add(temp);
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer temp = iterator.next();
            if (temp % n != 0) {
                iterator.remove();
            }
        }
    int[] answer = new int[list.size()];    
    for(int i=0; i<list.size();i++){
        answer[i] =list.get(i);
    }                                                
        return answer;
    }
}