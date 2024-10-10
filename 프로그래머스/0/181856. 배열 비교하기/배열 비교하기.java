class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr1.length==arr2.length){
           return compare(arr1,arr2);
        }else {
            return arr1.length>arr2.length? 1 : -1;
        }
        
 
    }
 private static int compare(int[] arr1, int[] arr2){
     int sum1 = 0;
     int sum2 = 0;
     for(int temp: arr1){
         sum1+=temp;
     }
      for(int temp: arr2){
         sum2+=temp;
     }
     if(sum2>sum1){
         return -1;
     }else if(sum2<sum1){
         return 1;
     }else{
         return 0;
     }
 }
}