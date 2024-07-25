import java.util.*;
class Solution {
    public int solution(String before, String after) {
      int answer =0;
        char[] beforeArr = before.toCharArray();
    char[] afterArr = after.toCharArray();
       Arrays.sort(afterArr);
         Arrays.sort(beforeArr);
      if(Arrays.equals(afterArr,beforeArr)){
          answer =1;
      }
        return answer;
    }
}