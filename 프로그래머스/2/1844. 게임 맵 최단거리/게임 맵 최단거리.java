import java.util.*;
class Solution {
    //이동할 수 있는 배열 선언
    private static int[] dx = {-1,0,1,0};
    private static int[] dy = {0,1,0,-1};    
    private static class Node{
        int x;
        int y;
        public Node(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    public int solution(int[][] maps) {
        int N =maps.length;
        int M =maps[0].length;
        //거리와 갔는지 안 갔는지를 체크 할 배열 선언
        int[][] dist = new int[N][M];
        
        Queue<Node> q = new ArrayDeque<>();        
        //큐 안에 넣고
        q.offer(new Node(0,0));
        //배열에 갔다고 표시
        dist[0][0]=1;
        
        while(!q.isEmpty()){
            Node now = q.poll();
            
            //갈 수 있는 네 방향 찾기
            for(int i =0; i<4;i++){
            int newx =now.x+dx[i];
            int newy =now.y+dy[i];    
            
            //근데 ? 예외상황
            if(newx>=0&&newy>=0&&newx<N&&newy<M&&maps[newx][newy]==1){
                if(dist[newx][newy]==0){
                    q.offer(new Node(newx,newy));
                    dist[newx][newy]=dist[now.x][now.y]+1;
                }
                
            }
                
                
            }//end for
            
            
        }
        
        
        
        
        return dist[N-1][M-1]==0? -1: dist[N-1][M-1];
    }
}