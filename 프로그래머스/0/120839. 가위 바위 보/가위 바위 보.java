class Solution {
    public String solution(String rsp) {
        String[] seq = rsp.split("");
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<seq.length;i++){
            if(seq[i].equals("2")){
                sb.append("0");
            }else if (seq[i].equals("0")){
                sb.append("5");
            }else{
                sb.append("2");
            }
        }
       
        return sb.toString();
    }
}