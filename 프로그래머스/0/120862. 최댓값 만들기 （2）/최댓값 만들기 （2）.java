import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int arrLen= numbers.length;
        int answer1 = numbers[arrLen-1]*numbers[arrLen-2];
        int answer2 = numbers[0]*numbers[1];
        
        return answer1>answer2? answer1:answer2;
    }
}