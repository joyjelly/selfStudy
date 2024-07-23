class Solution {
    public long solution(String numbers) {
        String[] numsArr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        StringBuilder sb = new StringBuilder();
        
        // while 루프의 조건 수정
        while(!numbers.isEmpty()) {
            for (int i = 0; i < numsArr.length; i++) {
                if (numbers.startsWith(numsArr[i])) {
                    sb.append(i);
                    numbers = numbers.substring(numsArr[i].length());
                    break;
                }
            }
        }
        
        long answer = Long.parseLong(sb.toString());
        return answer;
    }
}
