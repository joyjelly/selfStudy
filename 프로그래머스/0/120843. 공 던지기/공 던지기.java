class Solution {
    public int solution(int[] numbers, int k) {
        
        int length = numbers.length;
        int index = ((k-1)*2)%length;
        return numbers[index];
    }
}