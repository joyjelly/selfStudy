import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {

        List<Integer> list = new ArrayList<>();
        for(int i =0; i<flag.length;i++){
            if(flag[i]){//참
                int times = arr[i]*2;
                for(int j = 0; j<times;j++){
                    
                list.add(arr[i]);
                }

            }else{//거짓이면
                int l = arr[i];
                
                for(int j=0; j<l;j++){
                    if(list.size()>0){
                    list.remove(list.size()-1);
                }}
                
               }
                
            }
        

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}