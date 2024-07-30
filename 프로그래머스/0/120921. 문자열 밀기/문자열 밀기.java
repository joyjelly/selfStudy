class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        int flag =0;
        int leng = A.length();
        if(A.equals(B)){
            return 0;
        }
        for(int i =0;i<leng;i++){       
            
        String tempA = A.substring(0,leng-1);
        String tempB = A.substring(leng-1);
        A = tempB+tempA;
            flag++;
            if(A.equals(B)){
                answer =flag;
                break;
            }
        }
        return answer;
    }
}