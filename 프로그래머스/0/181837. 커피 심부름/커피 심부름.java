class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String temp:order){
            if(temp.contains("americano")||temp.contains("anything")){
                answer+=4500;
            }else{
                  answer+=5000;
            }
        }
        return answer;
    }
}