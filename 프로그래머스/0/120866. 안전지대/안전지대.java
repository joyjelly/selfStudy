class Solution {
    public int solution(int[][] board) {
              int rows = board.length;
        int cols = board[0].length;

        int[] dRow = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dCol = {0, 0, -1, 1, -1, 1, -1, 1};
        
    
        boolean[][] danger = new boolean[rows][cols];
     
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (board[r][c] == 1) {
                
                    danger[r][c] = true;
     
                    for (int i = 0; i < 8; i++) {
                        int newRow = r + dRow[i];
                        int newCol = c + dCol[i];
                        if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
                            danger[newRow][newCol] = true;
                        }
                    }
                }
            }
        }
        
        // 안전한 지역(위험하지 않은 지역)의 수 세기
        int safeCount = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (!danger[r][c]) {
                    safeCount++;
                }
            }
        }
        
        return safeCount;
    
    }
}