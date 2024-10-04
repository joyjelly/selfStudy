class Solution {
    private static boolean[] visited;
    private static int[][] computer;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        computer=computers;
        visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){//방문하지 않은 노드?
                DFS(i);
                answer++;
            }
        }
         
        return answer;
    }
    private static void DFS(int x){
        //방문처리
        visited[x] =true;
        for(int i = 0; i<computer[x].length;i++){
        //탐색하면서1인곳 찾아서
            if(computer[x][i]==1&&!visited[i]){
        //방문
                DFS(i);
            }
        }
    }
}