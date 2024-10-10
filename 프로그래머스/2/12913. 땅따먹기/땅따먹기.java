import java.util.*;
class Solution {
    int solution(int[][] land) {
        int n = land.length;
        for(int i =1; i<n; i++){
            for(int j = 0; j<4;j++){
                int max = 0;
                for(int k = 0; k<4;k++){
            if(j!=k){
                max = Math.max(max,land[i-1][k]);
            }
                }
                land[i][j] += max;
            }
        }
        
        
        

        return Arrays.stream(land[n-1]).max().getAsInt();
    }
}