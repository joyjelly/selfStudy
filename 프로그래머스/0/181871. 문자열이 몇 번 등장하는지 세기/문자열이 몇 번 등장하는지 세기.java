class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int n = pat.length();
        int m = myString.length();
        for(int i =0; i<m-n+1;i++){
            String temp = myString.substring(i,i+n);
            if(temp.equals(pat)){
                answer++;
            }
            
        }
        
        return answer;
    }
}