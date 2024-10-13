class Solution {
    public int[] solution(String my_string) {
        //a -97 z-122 A-65 Z-90
        int[] answer = new int[52];
        
        for(char c:my_string.toCharArray()){
            if((int)c>=97&&(int)c<=122){//소문자면
                answer[(int)c-71]++;
            }else{
                answer[(int)c-65]++;
            }
        }
        
        
        return answer;
    }
}