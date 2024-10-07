class Solution {
    private static int answer;
    private static int[][] Dungeon;
    private static boolean[] visited;
    public int solution(int k, int[][] dungeons) {
        //k: 피로도, dungeons:던전별 피로도 정보
       answer = 0;
        Dungeon = dungeons;
        visited = new boolean[dungeons.length];
        DFS(k, 0);
        return answer;
    }
    private static void DFS(int k, int cnt){//피로도와 횟수 카운트
        for(int i =0; i<Dungeon.length; i++){
            if(!visited[i]&&k-Dungeon[i][0]>=0){
            visited[i] =true;
            DFS(k-Dungeon[i][1],cnt+1);
            answer = Math.max(answer,cnt+1);
                visited[i] = false;
            }
        }
        
        
    }
    
    
}