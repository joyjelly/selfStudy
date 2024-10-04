import java.util.*;

class Solution {
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};

    private static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static char[][] map;
    private static int N, M;

    public int solution(String[] maps) {
        N = maps.length;
        M = maps[0].length();
        map = new char[N][M];
        for (int i = 0; i < N; i++) {
            map[i] = maps[i].toCharArray();
        }

        Point start = null;
        Point lever = null;
        Point end = null;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'S') {
                    start = new Point(j, i);
                } else if (map[i][j] == 'L') {
                    lever = new Point(j, i);
                } else if (map[i][j] == 'E') {
                    end = new Point(j, i);
                }
            }
        }

        int startLever = BFS(start, lever);
        int leverEnd = BFS(lever, end);

        if (startLever == -1 || leverEnd == -1) {
            return -1;
        } else {
            return startLever + leverEnd;
        }
    }

    private static int BFS(Point start, Point end) {
        int[][] dist = new int[N][M];
        Queue<Point> q = new ArrayDeque<>();
        q.offer(start);
        dist[start.y][start.x] = 1;

        while (!q.isEmpty()) {
            Point now = q.poll();

            for (int i = 0; i < 4; i++) {
                int newx = now.x + dx[i];
                int newy = now.y + dy[i];

                if (newx >= 0 && newy >= 0 && newx < M && newy < N && dist[newy][newx] == 0&&map[newy][newx]!='X') {
                    q.offer(new Point(newx, newy));
                    dist[newy][newx] = dist[now.y][now.x] + 1;

                    if (newx == end.x && newy == end.y) {
                        return dist[end.y][end.x] - 1;
                    }
                }
            }
        }
        return -1;
    }
}
