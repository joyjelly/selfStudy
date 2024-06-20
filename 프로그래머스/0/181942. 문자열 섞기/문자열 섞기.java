class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
       
        if(str1.length()==str2.length()){
           for(int i =0;i<str1.length();i++){
               sb.append(str1.substring(i,(i+1)));
                sb.append(str2.substring(i,(i+1)));
           }
        }
             return sb.toString();
        
    }
}