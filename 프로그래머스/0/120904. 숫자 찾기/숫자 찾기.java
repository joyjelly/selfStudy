class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String strN = String.valueOf(num);
        String compare =String.valueOf(k);
        String[] strArr = strN.split("");
        for(int i =0;i<strArr.length;i++){
            if(strArr[i].equals(compare)){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}