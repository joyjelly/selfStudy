import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(indices);  // 인덱스 배열을 오름차순으로 정렬
        int g = 0;  // 인덱스 배열을 가리키는 변수
        for (int i = 0; i < my_string.length(); i++) {
         
            if (g < indices.length && indices[g] == i) {
                g++;  
                continue;
            }
            sb.append(my_string.charAt(i));  // 인덱스가 아닌 문자만 추가
        }
        return sb.toString();  // 최종 문자열 반환
    }
}
