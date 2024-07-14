import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sorted = emergency.clone();
        Arrays.sort(sorted);

        int n = sorted.length;
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            rankMap.put(sorted[i], n - i);
        }

        // 순위로 이루어진 결과 배열을 만듭니다.
        int[] result = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            result[i] = rankMap.get(emergency[i]);
        }

        return result;
    }

  
}
