class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] validWords = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            String temp = word;
            for (String validWord : validWords) {
                temp = temp.replace(validWord, " ");
            }
            if (temp.trim().isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}
