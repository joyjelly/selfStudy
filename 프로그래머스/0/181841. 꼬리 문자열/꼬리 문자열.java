class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(String temp : str_list){
            if(temp.contains(ex)){
                continue;
            }
            sb.append(temp);
        }
        return sb.toString();
    }
}