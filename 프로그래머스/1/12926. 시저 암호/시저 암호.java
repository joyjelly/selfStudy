class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(char x: s.toCharArray()){
            if(x==' '){
                sb.append(" ");
            }else if((65<=(int) x && 90>=(int)x)){
                x +=n;
                if(x>90){
                    x-=26;
                }
                sb.append((char)x);
            }else{
                x +=n;
                if(x>122){
                    x-=26;
                }
                sb.append((char)x);
            }
        }
        return sb.toString();
    }
}