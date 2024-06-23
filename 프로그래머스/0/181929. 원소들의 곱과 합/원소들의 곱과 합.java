class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int flag =1;
        int compare =0;
        for(int i =0;i<num_list.length;i++){
            flag*=num_list[i];
            compare+=num_list[i];
        }
        if(flag<(compare*compare)){
            answer =1;
        }else{
            answer =0;
        }
        return answer;
    }
}