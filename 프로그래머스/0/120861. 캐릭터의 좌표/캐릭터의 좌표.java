class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        
        int height = board[1] / 2;
        int width = board[0] / 2;
        
        for(String temp : keyinput) {
            if(temp.equals("up") && answer[1] < height) {
                answer[1]++;
            } else if(temp.equals("down") && answer[1] > -height) {
                answer[1]--;
            } else if(temp.equals("right") && answer[0] < width) {
                answer[0]++;
            } else if(temp.equals("left") && answer[0] > -width) {
                answer[0]--;
            }
        }
        
        return answer;
    }
}
