import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0 ; i<commands.length;i++){
            int st =commands[i][0];
            int ed =commands[i][1];
            int value =commands[i][2];
            
            int[] temp = Arrays.copyOfRange(array,st-1,ed);
            Arrays.sort(temp);
            answer[i] = temp[value-1];
            
        }
        
        return answer;
    }
}