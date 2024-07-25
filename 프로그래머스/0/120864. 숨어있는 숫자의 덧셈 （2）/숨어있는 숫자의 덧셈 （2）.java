class Solution {
    public int solution(String my_string) {
        int answer = 0;
       StringBuilder num = new StringBuilder();

        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) {
                num.append(ch);
            } else {
                if (num.length() > 0) {
                    answer += Integer.parseInt(num.toString());
                    num.setLength(0); 
                }
            }
        }

        if (num.length() > 0) {
            answer += Integer.parseInt(num.toString());
        }
        
        return answer;
    }
}