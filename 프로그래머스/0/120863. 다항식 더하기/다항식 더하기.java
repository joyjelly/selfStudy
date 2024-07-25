class Solution {
    public String solution(String polynomial) {
        // 공백을 기준으로 문자열을 나누어 배열로 만듭니다.
        String[] arr = polynomial.split(" ");
        int xCount = 0;
        int constantCount = 0;
        
        // 각 항을 순회하면서 처리합니다.
        for (String term : arr) {
            if (term.contains("x")) { // 'x'가 포함된 경우
                if (term.equals("x")) {
                    xCount += 1;
                } else {
                    xCount += Integer.parseInt(term.replace("x", ""));
                }
            } else if (!term.equals("+")) { // 상수항 처리
                constantCount += Integer.parseInt(term);
            }
        }
        
        // 결과 문자열 조립
        StringBuilder answer = new StringBuilder();
        if (xCount != 0) {
            answer.append(xCount == 1 ? "x" : xCount + "x");
        }
        if (constantCount != 0) {
            if (xCount != 0) {
                answer.append(" + ");
            }
            answer.append(constantCount);
        }
        
        // xCount와 constantCount가 모두 0일 경우 "0" 반환
        if (xCount == 0 && constantCount == 0) {
            return "0";
        }
        
        return answer.toString();
    }
}
