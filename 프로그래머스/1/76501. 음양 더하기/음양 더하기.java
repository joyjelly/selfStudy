class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        //배열 두개를 합쳐서 하나의 정수를 만들고, 그 정수들의 합을 리턴해야한다.
        for(int i =0;i<absolutes.length;i++){
            if(signs[i]){
                answer +=absolutes[i];
            }else{
                 answer -=absolutes[i];
            }
        }
        
        return answer;
    }
}