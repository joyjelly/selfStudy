class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean flag1 = x1||x2;
        boolean flag2 = x3||x4;
        answer =flag1&&flag2;
        return answer;
    }
}