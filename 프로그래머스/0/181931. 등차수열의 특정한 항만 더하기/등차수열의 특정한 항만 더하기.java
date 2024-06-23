class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] dArr = new int[included.length];
        for(int i =0; i<dArr.length;i++){
            dArr[i] =a+d*i;
            if(included[i]){
                answer +=dArr[i];
            }
        }
        return answer;
    }
}