class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        int length = box.length;
        int[] answerArr = new int[length];
        for(int i =0;i<length;i++){
            answerArr[i]=box[i]/n;
            answer *= answerArr[i];
        }
        
        
        return answer;
    }
}