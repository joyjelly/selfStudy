class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(String temp: myString.split("")){
            if(temp.equals("A")){
                sb.append("B");
            }else{
                sb.append("A");
            }
        }
    
        return sb.toString().contains(pat) ? 1:0;
    }
}