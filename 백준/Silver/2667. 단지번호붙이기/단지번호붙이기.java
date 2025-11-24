import java.util.*;
import java.io.*;

class Main {

    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 🔥 단지번호붙이기는 N만 있음!!
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];

        // 지도 입력
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        int cnt = 0;
        List<Integer> areaList = new ArrayList<>();

        // 전체 탐색
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    cnt++;
                    areaList.add(bfs(i, j));
                }
            }
        }

        // 출력
        System.out.println(cnt);
        Collections.sort(areaList);
        for (int area : areaList) {
            System.out.println(area);
        }
    }

    static int bfs(int sx, int sy) {
        Queue<int[]> q = new LinkedList<>();
        visited[sx][sy] = true;
        q.offer(new int[]{sx, sy});
        int area = 1;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                if (map[nx][ny] == 0) continue;
                if (visited[nx][ny]) continue;

                visited[nx][ny] = true;
                area++;
                q.offer(new int[]{nx, ny});
            }
        }
        return area;
    }
}
