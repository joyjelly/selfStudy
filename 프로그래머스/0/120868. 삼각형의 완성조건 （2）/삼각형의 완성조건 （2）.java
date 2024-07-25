import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
       
        Arrays.sort(sides);
         int small = sides[0];
        int big = sides[1];
        //sides[1]이 가장 긴 변 일 경우
        //sides[0]+x<int[1]
        for(int i=big-small+1;i<=big;i++){
            answer++;
        }
        for(int j =big+1;j<small+big;j++){
            answer++;
        }
        return answer;
    }
}