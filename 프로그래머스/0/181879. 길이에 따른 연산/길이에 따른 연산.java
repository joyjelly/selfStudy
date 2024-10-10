class Solution {
    public int solution(int[] num_list) {
       
        if(num_list.length>=11){
          return  add(num_list);
        }else{
         return   multi(num_list);
        }
     
    }
    private static int add(int arr[]){
        int sum = 0;
        
        for(int temp: arr){
            sum+=temp;
        }
        return sum;
    }
     private static int multi(int arr[]){
        int mul =1;
          for(int temp: arr){
            mul*=temp;
        }
         return mul;
    }
}