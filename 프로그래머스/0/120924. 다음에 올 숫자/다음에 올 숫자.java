class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int length =common.length;
        int minus = common[1]-common[0];
        if(common[2]-common[1]==minus){
            answer = common[length-1]+minus;
        }else{
            int times = common[1]/common[0];
            answer = common[length-1]*times;
        }
        return answer;
    }
}