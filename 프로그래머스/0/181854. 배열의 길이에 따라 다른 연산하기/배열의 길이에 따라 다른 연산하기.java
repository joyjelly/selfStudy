class Solution {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;
        if(len%2==0){//길이가 짝수면?
            for(int i =0; i<len;i++){
                if(i%2==1){
                    arr[i]+=n;
                }
            }
            
            
        }else{
            for(int i =0; i<len;i++){
                if(i%2==0){
                    arr[i]+=n;
                }
            }
        }
        
        
        return arr;
    }
}