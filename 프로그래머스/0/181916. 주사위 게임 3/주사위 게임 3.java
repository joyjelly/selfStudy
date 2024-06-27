import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int a, int b, int c, int d) {
      
        int[] counts = new int[7]; 
        counts[a]++;
        counts[b]++;
        counts[c]++;
        counts[d]++;

      
        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 4) {
            
                return 1111 * i;
            }
        }

        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 3) {
              
                for (int j = 1; j <= 6; j++) {
                    if (counts[j] == 1) {
                        return (int) Math.pow((10 * i + j), 2);
                    }
                }
            }
        }

        int pairCount = 0;
        int firstPair = 0;
        int secondPair = 0;

        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 2) {
                if (pairCount == 0) {
                    firstPair = i;
                } else {
                    secondPair = i;
                }
                pairCount++;
            }
        }

        if (pairCount == 2) {
          
            return (firstPair + secondPair) * Math.abs(firstPair - secondPair);
        }

        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 2) {
                
                int q = 0, r = 0;
                for (int j = 1; j <= 6; j++) {
                    if (counts[j] == 1) {
                        if (q == 0) {
                            q = j;
                        } else {
                            r = j;
                        }
                    }
                }
                return q * r;
            }
        }

       
        int minValue = Integer.MAX_VALUE;
        for (int i = 1; i <= 6; i++) {
            if (counts[i] > 0) {
                minValue = Math.min(minValue, i);
            }
        }

        return minValue;
    }
}