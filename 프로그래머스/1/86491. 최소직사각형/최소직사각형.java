class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxX=0;
        int maxY=0;
        for(int i =0;i<sizes.length;i++){
           if(sizes[i][0]<sizes[i][1]){
               int temp =sizes[i][0];
               sizes[i][0] = sizes[i][1];
               sizes[i][1] = temp;
           }
            maxX = Math.max(sizes[i][0],maxX);
            maxY = Math.max(sizes[i][1],maxY);
        }
        
        
        
        
        return maxX*maxY;
    }
}