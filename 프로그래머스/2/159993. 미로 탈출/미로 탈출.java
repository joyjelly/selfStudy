import java.util.*;
class Solution {
    private static int[] dx ={-1,0,1,0};
    private static int[] dy ={0,-1,0,1};
    private static char[][] map;
    private static int N;
    private static int M;
    private static class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public int solution(String[] maps) {
        int answer = 0;
        N = maps.length;
        M = maps[0].length();
        map = new char[N][M];
        for(int i =0; i<N;i++){
            map[i] =maps[i].toCharArray();
        }
        Point start= null;
        Point exit = null;
        Point lever =null;;
        
        for(int i =0; i<N;i++){
            for(int j = 0; j<M;j++){
                if(map[i][j]=='S'){
                    start = new Point(j,i);
                }else if(map[i][j]=='E'){
                    exit =new Point(j,i);
                }else if((map[i][j]=='L')){
                    lever = new Point(j,i);
                }
                
            }
        }
        int startLever =BFS(start,lever);
        int leverExit = BFS(lever,exit);
        
        if(startLever==-1||leverExit==-1){
            return -1;
        }else{
            return startLever+leverExit;
        }

    }
    private static int BFS(Point start, Point end){
        int[][] dist = new int[N][M];
        Queue<Point> q = new ArrayDeque<>();
        q.offer(start);
        dist[start.y][start.x] =1;
        
        while(!q.isEmpty()){
            Point now = q.poll();
            for(int i =0; i<4; i++){
                int nx = now.x+dx[i];
                int ny = now.y+dy[i];
                
                
            if(nx>=0&&ny>=0&&ny<N&&nx<M&&map[ny][nx]!='X'&&dist[ny][nx]==0){
                dist[ny][nx]=dist[now.y][now.x]+1;
                q.offer(new Point(nx,ny));
            }
                if(nx ==end.x&&ny ==end.y){
                return dist[end.y][end.x]-1;
            }
            
            
            }
        }
       return -1;
        
    }
}