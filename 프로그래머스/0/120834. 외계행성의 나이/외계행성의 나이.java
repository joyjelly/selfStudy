class Solution {
    public String solution(int age) {
        String[] al = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        
        String ageStr = String.valueOf(age);
        StringBuilder sb = new StringBuilder();
        for (char digit : ageStr.toCharArray()) {
            int num = digit - '0'; 
            sb.append(al[num]); 
        }
   
        return sb.toString();
    }
}
