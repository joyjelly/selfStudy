import java.util.*;
class Solution {
   private static int width;
   private static int height;
   private boolean isvaild(int x, int y, int nx,int ny){
       return Math.abs(x+nx)<=width&&Math.abs(y+ny)<=height;
       } 
    public int[] solution(String[] keyinput, int[] board) {
      int x =0;
    int y = 0;
        
    Map<String, int[]> moves = new HashMap<>();
        moves.put("up",new int[]{0,1});
        moves.put("down",new int[]{0,-1});
        moves.put("right",new int[]{1,0});
        moves.put("left",new int[]{-1,0});
        width =board[0]/2;
        height= board[1]/2;
        for(String temp:keyinput){
            int nx = moves.get(temp)[0];
            int ny = moves.get(temp)[1];
            
            if(isvaild(x,y,nx,ny)){
                x+=nx;
                y+=ny;
            }
            
        }
        
        
        return new int[]{x,y};
    }
}