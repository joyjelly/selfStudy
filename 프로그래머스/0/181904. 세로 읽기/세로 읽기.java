class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int len = my_string.length();
        StringBuilder sb = new StringBuilder();
        for(int i  = 0; i<len/m;i++){
            String temp = my_string.substring(0,m);
            sb.append(temp.charAt(c-1));
            my_string = my_string.substring(m);
        }
        
        
        
        
        return sb.toString();
    }
}