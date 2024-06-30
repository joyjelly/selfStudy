import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = 0;
        int length = array.length;
        int mid = length/2;
            answer = array[mid];
        return answer;
    }
}