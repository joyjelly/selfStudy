import java.util.HashMap;
class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        
        int maxValue = 0;
        int maxFreq = 0;
        boolean flag = false;
        
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxValue = entry.getKey();
                flag = false; 
            } else if (entry.getValue() == maxFreq) {
                flag = true;
            }
        }
        
        
        if (flag) {
            return -1;
        }
        return maxValue;
    }
}
