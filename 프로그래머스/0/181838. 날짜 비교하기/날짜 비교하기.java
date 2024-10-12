class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        
        
        return count(date1)<count(date2)? 1:0;
    }
    
    private static int count(int[] arr){
       return arr[0]*365+arr[1]*30+arr[2];
        
        
    }
    
}