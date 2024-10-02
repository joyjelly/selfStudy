class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = true; // 다음 문자를 대문자로 변환할지 여부
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
                capitalizeNext = true; // 공백 후에는 대문자로 변환 준비
            } else {
                if (capitalizeNext && !Character.isDigit(c)) {
                    sb.append(Character.toUpperCase(c)); // 대문자로 변환
                } else {
                    sb.append(Character.toLowerCase(c)); // 소문자로 변환
                }
                capitalizeNext = false; // 공백이 아닌 문자가 나왔으므로 다음 문자는 소문자로 변환
            }
        }
        
        return sb.toString();
    }
}
