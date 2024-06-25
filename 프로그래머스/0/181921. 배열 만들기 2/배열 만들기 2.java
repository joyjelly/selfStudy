import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int l, int r) {
        List<Integer> resultList = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String compare = String.valueOf(i);
            boolean isValid = true;
            
            for (int j = 0; j < compare.length(); j++) {
                if (compare.charAt(j) != '5' && compare.charAt(j) != '0') {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                resultList.add(i);
            }
        }
        
        if (resultList.isEmpty()) {
            return new int[]{-1};
        }
        
      
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}
