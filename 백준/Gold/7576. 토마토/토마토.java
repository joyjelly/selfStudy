import java.io.*;
import java.util.*;

public class Main {

    // 1. 전역변수 선언
    static int M, N;          // M: 가로(열), N: 세로(행)
    static int[][] box;       // 토마토 상태 (1,0,-1)
    static int[][] dist;      // 해당 칸이 익는 데 걸린 날짜
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws Exception {

        // 2. 입력 도구 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 3. M, N 입력
        M = Integer.parseInt(st.nextToken()); // 가로(열) 개수
        N = Integer.parseInt(st.nextToken()); // 세로(행) 개수

        // 4. 배열 초기화
        box = new int[N][M];
        dist = new int[N][M];

        // 5. 토마토 상태 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                dist[i][j] = 0; // 기본 0일
            }
        }

        // 6. 큐 만들기
        Queue<int[]> q = new LinkedList<>();

        // 7. 처음부터 익어있는 토마토(1)를 모두 큐에 넣기
        //    → 여러 시작점에서 동시에 BFS 시작하는 느낌
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 1) {
                    q.offer(new int[]{i, j});
                }
            }
        }

        // 8. BFS 실행
        bfs(q);

        // 9. 정답 계산
        int answer = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                // 9-1. 익지 않은 토마토(0)가 하나라도 남아 있으면 -1
                if (box[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }

                // 9-2. 최대로 오래 걸린 날짜 찾기
                answer = Math.max(answer, dist[i][j]);
            }
        }

        System.out.println(answer);
    }

    // BFS: 여러 시작점(처음 익은 토마토들)에서 동시에 퍼져나감
    static void bfs(Queue<int[]> q) {

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                // 1) 범위 밖이면 continue
                if(nx<0||ny<0||nx>=N||ny>=M) continue;
                // 2) 토마토가 없거나(-1) 이미 익은 칸(1)이면 continue
                if(box[nx][ny]!=0) continue;
                
                box[nx][ny] =1;
                dist[nx][ny] = dist[x][y]+1;
                q.offer(new int[]{nx,ny});
                
                // 3) 아직 안 익은 토마토(0)라면:

            }
        }
    }
}
