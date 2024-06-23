class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddNumbers = new StringBuilder();
        StringBuilder evenNumbers = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenNumbers.append(num);
            } else {
                oddNumbers.append(num);
            }
        }

        int oddSum = oddNumbers.length() > 0 ? Integer.parseInt(oddNumbers.toString()) : 0;
        int evenSum = evenNumbers.length() > 0 ? Integer.parseInt(evenNumbers.toString()) : 0;

        return oddSum + evenSum;
    }
      

}