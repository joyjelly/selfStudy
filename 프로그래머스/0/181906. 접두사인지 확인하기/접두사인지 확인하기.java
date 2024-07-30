class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String[] pre = new String[my_string.length()];
        for(int i=0;i<my_string.length();i++){
            pre[i] =my_string.substring(0,i+1);
        }
        for(String temp:pre){
            if(temp.equals(is_prefix)){
                answer =1;
            }
        }
        return answer;
    }
}