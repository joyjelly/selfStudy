import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String letter) {
        Map<String,Character> map = new HashMap<>();
        String[] codes ={ ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String alpabet ="abcdefghijklmnopqrstuvwxyz";
        for(int i =0;i<codes.length;i++){
            map.put(codes[i], alpabet.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        
        String[] trans =letter.split(" ");
        for(String temp :trans){
            Character transChar = map.get(temp);
            if(transChar !=null){
                sb.append(transChar);
            }
        }
        
        
       
        return sb.toString();
    }
}