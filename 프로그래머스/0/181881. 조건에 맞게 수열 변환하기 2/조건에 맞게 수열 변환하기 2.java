import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while(true){
            int[] temp = change(arr);  // 복사본이 아니라 원본 수정
            if(Arrays.equals(arr, temp)){  // 배열의 값 비교
                return answer;
            }
            answer++;
            arr = temp.clone();  // temp를 복사해서 arr에 할당
        }
    }

    private static int[] change(int[] arr){
        int[] newArr = arr.clone();  // 원본 배열을 복사하여 새로운 배열 생성
        for(int i = 0; i < newArr.length; i++){
            if(newArr[i] >= 50 && newArr[i] % 2 == 0){
                newArr[i] /= 2;
            } else if(newArr[i] < 50 && newArr[i] % 2 == 1){
                newArr[i] = newArr[i] * 2 + 1;
            }
        }
        return newArr;  // 새로운 배열 반환
    }
}
