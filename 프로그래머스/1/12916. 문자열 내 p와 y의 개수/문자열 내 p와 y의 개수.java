class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s=s.toUpperCase();
        int cntP = 0;
        int cntY = 0;
        for( char c: s.toCharArray()){
            if(c=='P'){
                cntP++;
            }
            if(c=='Y'){
                cntY++;
            }
        }
        if(cntP!=cntY){
            answer = false;
        }
        
        
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(s);

        return answer;
    }
}