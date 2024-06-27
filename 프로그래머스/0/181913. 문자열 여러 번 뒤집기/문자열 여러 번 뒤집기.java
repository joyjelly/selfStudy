class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
    
        int s =0;
        int e =0;
        for(int i =0; i<queries.length;i++){
            s = queries[i][0];
            e = queries[i][1];
            StringBuilder part =new StringBuilder(sb.substring(s,e+1));
            part.reverse();
            sb.replace(s,e+1,part.toString());
        }
        return sb.toString();
    }
}