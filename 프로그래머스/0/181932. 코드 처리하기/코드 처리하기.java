class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuilder ret = new StringBuilder();

       
        for (int idx = 0; idx < code.length(); idx++) {
            char currentChar = code.charAt(idx);
            if (mode == 0) {
                if (currentChar == '1') {
                   
                    mode = 1;
                } else if (idx % 2 == 0) {
                  
                    ret.append(currentChar);
                }
            } else {
                if (currentChar == '1') {
                 
                    mode = 0;
                } else if (idx % 2 != 0) {
                 
                    ret.append(currentChar);
                }
            }
        }

        // 결과가 빈 문자열이면 "EMPTY" 반환
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}