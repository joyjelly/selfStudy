import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        if (share == 0 || balls == share) {
            return 1;
        }
        
        BigInteger ballsMax = BigInteger.ONE;
        BigInteger shareMax = BigInteger.ONE;
        BigInteger minus = BigInteger.ONE;
        
        for (int i = 1; i <= balls; i++) {
            ballsMax = ballsMax.multiply(BigInteger.valueOf(i));
        }
        
        for (int j = 1; j <= share; j++) {
            shareMax = shareMax.multiply(BigInteger.valueOf(j));
        }
        
        for (int k = 1; k <= (balls - share); k++) {
            minus = minus.multiply(BigInteger.valueOf(k));
        }
        
        BigInteger result = ballsMax.divide(shareMax.multiply(minus));
        
        return result.intValue();
    }
}
