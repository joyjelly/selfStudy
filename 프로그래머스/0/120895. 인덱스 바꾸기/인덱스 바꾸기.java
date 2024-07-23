class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char temp = my_string.charAt(num1);
        char temp2 = my_string.charAt(num2);
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<my_string.length();i++){
            if(i==num1){
                sb.append(temp2);
            }else if(i==num2){
                sb.append(temp);
            }else{
                sb.append(my_string.charAt(i));
            }
            
        }
        
        return sb.toString();
    }
}