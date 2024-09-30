class Solution {
    public int solution(int n) {
        
        int divide = 1234567;
        int num = fibo(n);
        return num%divide;
    }
    
    static int fibo(int x){
        int[] arr = new int[x];
        arr[0] =1;
        arr[1] =1;
        
        for(int i =2;i<x;i++){
            arr[i] = (arr[i-1]+arr[i-2])%1234567;
        
        }
        return arr[x-1];
    }
    
}

