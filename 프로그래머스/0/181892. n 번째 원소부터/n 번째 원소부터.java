class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];  // 배열 크기 조정
        
        for (int i = n - 1; i < num_list.length; i++) {  // n번째부터 시작
            answer[i - (n - 1)] = num_list[i];  // 결과 배열에 복사
        }
        
        return answer;
    }
}
