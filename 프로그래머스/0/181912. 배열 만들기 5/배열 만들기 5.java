import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> resultList = new ArrayList<>();
      
        for (int i = 0; i < intStrs.length; i++) {
            String temp = intStrs[i].substring(s, s + l);
            int num = Integer.parseInt(temp);
            if (num > k) {
                resultList.add(num);
            }
        }
      
       
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
      
        return answer;
    }
}
