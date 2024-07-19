class Solution {
    public int[][] solution(int[] num_list, int n) {
        int leng = num_list.length;
        int row = leng/n;
        int[][] answer = new int[row][n];
        for(int i =0;i<row;i++){
            for(int j=0;j<n;j++){
                answer[i][j]=num_list[i*n+j];
            }
        }
        return answer;
    }
}