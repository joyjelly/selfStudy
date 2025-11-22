import java.util.*;
import java.io.*;
public class Main {
    static int N,M; //미로크기(행, 열)
    static int[][] map;//미로정보(0:벽, 1: 길)
    static int[][] dist;//거리저장배열
    static boolean[][] visited; //방문여부
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
  
	public static void main(String[] args) throws IOException{
        BufferedReader  br = new BufferedReader (new InputStreamReader(System.in));
	    //1.N,M 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());//행
        M=Integer.parseInt(st.nextToken());//열
        
        //2. 배열 초기화
        map = new int[N][M];
        dist = new int[N][M];
        visited = new boolean[N][M];
        
        //3. 미로정보 입력받기
        for(int i =0;i<N;i++){
            String line = br.readLine();//공백없이 붙어있는 숫자들
            for(int j = 0;j<M;j++){
                map[i][j] = line.charAt(j) -'0';//'1' ->1, '0' ->0
            }
        }
        bfs(0,0);
        System.out.println(dist[N - 1][M - 1]);
        
	}
    
    static void bfs(int startX,int startY){
        Queue<int[]> q = new LinkedList<>();
        
        //시작점 초기설정
        q.offer(new int[]{startX,startY});//넣고
        visited[startX][startY] = true;//방문표시
        dist[startX][startY] =1; //시작칸 거리세기
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x =cur[0];
            int y =cur[1];
            
            for(int d = 0;d<4;d++){
                int nx = x+dx[d];
                int ny = y+dy[d];
                
                //범위 밖이면 패스
                if(nx<0||ny<0||nx>=N||ny>=M) continue;
                //벽(0)이면 패스
                if(map[nx][ny]==0) continue;
                //이미 방문했으면 패스
                if(visited[nx][ny]) continue;
                
                //모두통과 -> 갈 수 있는 새칸!
                
                visited[nx][ny] = true;
                q.offer(new int[]{nx,ny});
                dist[nx][ny]= dist[x][y]+1;//이전값(dist[x][y])+1

            }
        }  
    } 
}