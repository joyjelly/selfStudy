import java.util.*;

class Solution {
    public int solution(int[][] maps) {

        // 1. N, M 세팅하기
        int N = maps.length;
        int M = maps[0].length;
        // 2. 방향벡터(dx, dy) 정의하기
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,1,-1};
        // 3. visited 배열 만들기
        boolean[][] visited = new boolean[N][M];
        // 4. dist 배열 만들기
        int[][] dist = new int[N][M];
        // 5. Queue 만들기
        Queue<int[]> q = new LinkedList<>(); //배열의 큐가 만들어져야함
        // 6. 시작점 초기화하기 ->세 배열 다
        visited[0][0] = true;
        dist[0][0] = 1;
        q.offer(new int[]{0,0});
        
        // 7. BFS 시작하기 (while문)
        while(!q.isEmpty()){
        // 8. 현재 위치 꺼내기
        int[] cur = q.poll();
        // 9. 4방향 탐색하기 (for문)
        for(int i  = 0;i<4;i++){
            int nx = cur[0]+dx[i];
            int ny = cur[1]+dy[i];
        
        // 10. 범위 벗어나면 건너뛰기
        if(nx<0||ny<0||nx>=N||ny>=M) continue;
        // 11. 벽이면 건너뛰기
        if(maps[nx][ny]==0) continue;
        // 12. 방문했으면 건너뛰기
        if(visited[nx][ny]) continue;
        // 13. 방문 표시하기
        visited[nx][ny] =true;
        // 14. 거리 증가시키기
        dist[nx][ny] =dist[cur[0]][cur[1]]+1;
        // 15. 큐에 넣기
        q.offer(new int[]{nx,ny});
            }
       }
        // 16. 도착점 값이 0이면 -1, 아니면 거리 리턴하기
         return dist[N-1][M-1]==0?-1:dist[N-1][M-1]; 
            
       
    }
}
