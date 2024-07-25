class Solution {
    public int solution(int n) {
        String strN = String.valueOf(n);
        String[] strArr = strN.split("");
        
        int answer = 0;
        
        for(int i =0; i<strArr.length;i++){
            answer +=Integer.parseInt(strArr[i]);
        }
        return answer;
    }
}