import java.util.*;
class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
       
       for(int i =0;i<arr.length;i++){
           arr[i] = Character.toLowerCase(arr[i]);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(char temp2 : arr){
            sb.append(temp2);
        }
        
     
        
        return sb.toString();
    }
}