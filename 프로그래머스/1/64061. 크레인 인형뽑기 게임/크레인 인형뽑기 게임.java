import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> bucket = new Stack<>();
        //스택 배열
        Stack<Integer>[] lanes = new Stack[board.length];
        //초기화
        for(int i =0; i<board.length;i++){
            lanes[i] = new Stack<>();
        }
        //board 배열의 값을 각 스택에 넣기
        for(int i =board.length-1;i>=0;i--){
            for(int j = 0; j<board[i].length;j++){
                if(board[i][j]!=0){
                lanes[j].push(board[i][j]);
                }
            }
        }
        //moves 배열을 돌리며 (값-1) 해당 스택에서 pop 해서
        for(int move: moves){
            if(!lanes[move-1].isEmpty()){                
            int picked = lanes[move-1].pop();
           if(!bucket.isEmpty()&&bucket.peek()==picked){
               bucket.pop();
               answer +=2;
           }else{
            bucket.push(picked);
           }
            }
        }
        //bucket 배열에 넣기근데? peek을 한게 가지고있는게 같으면 pop 을 시키고 answer += 2;
        
        
        
        return answer;
    }
}