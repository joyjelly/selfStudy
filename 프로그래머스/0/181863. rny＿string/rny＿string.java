class Solution {
    public String solution(String rny_string) {
        StringBuilder sb = new StringBuilder();
        
        for(String temp : rny_string.split("")){
            if(temp.equals("m")){
                sb.append("rn");
            }else{
            sb.append(temp);
                
            }
        }
        
        return sb.toString();
    }
}