class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int temp:num_list){
            answer+= times(temp);
        }
        return answer;
    }
    private static int times(int n){
        int i =0;
        while(n>1){
            i++;
        if(n%2==0){
            n /=2;
        }else{
            n= (n-1)/2;
        }
            
        }
        return i;
    }
    
}