class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<numLog.length-1;i++){
            int prev=numLog[i];
            int next=numLog[i+1];
            if(prev+1==next){
                sb.append("w");
            }else if(prev-1==next){
                 sb.append("s");
            }else if(prev+10==next){
                 sb.append("d");
            }else{
                  sb.append("a");
            }
        }
        return sb.toString();
    }
}