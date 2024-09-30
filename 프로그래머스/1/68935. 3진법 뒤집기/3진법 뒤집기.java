class Solution {
    public int solution(int n) {
       
        String three = Integer.toString(n,3);
        StringBuilder sb = new StringBuilder(three);
        
        
        
        return Integer.parseInt(sb.reverse().toString(),3);
    }
}