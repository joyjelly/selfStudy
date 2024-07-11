import java.util.Arrays;
class Solution {
    public int solution(int[] array, int height) {
        Arrays.sort(array);
         int answer = 0;
        for(int temp:array){
            if(temp>height){
                answer++;
            }
        }
       
        return answer;
    }
}