class Solution {
    public int[] solution(int[] arr, int k) {
        int leng = arr.length;
        int[] answer = new int[leng];
        if(k%2==0){//짝수
            for(int i =0; i<leng;i++ ){
             answer[i] = arr[i]+k;
            }
        }else{
            for(int i =0; i<leng;i++ ){
             answer[i] = arr[i]*k;
            }
        }
        return answer;
    }
}