import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        for (int[] c : commands) {
            
            int[] temp = Arrays.copyOfRange(array, c[0] - 1, c[1]);
            Arrays.sort(temp);
            list.add(temp[c[2] - 1]);
        }
        
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
