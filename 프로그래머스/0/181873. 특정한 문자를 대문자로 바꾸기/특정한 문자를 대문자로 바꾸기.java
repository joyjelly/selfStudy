class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder() ;
        for(char temp : my_string.toCharArray()){
            if((String.valueOf(temp)).equals(alp)){
                sb.append(Character.toUpperCase(temp));
            }else{
                sb.append(temp);
            }
        }
        return sb.toString();
    }
}