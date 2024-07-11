class Solution {
    public String solution(String my_string, int n) {
        int len = my_string.length();
        String cut ="";
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<len;i++){
            cut =my_string.substring(i,i+1);
            for(int j =0;j<n;j++){
                sb.append(cut);
            }
            
        }
        
        
        return sb.toString();
    }
}