class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] strArr = s.split(" ");
        int temp =0;
        for(int i =0; i<strArr.length;i++){
            if(strArr[i].equals("Z")){
                answer -= temp;
            }else{
                 temp = Integer.parseInt(strArr[i]);
           
            answer += Integer.parseInt(strArr[i]);
           
                 }
        }
        return answer;
    }
}