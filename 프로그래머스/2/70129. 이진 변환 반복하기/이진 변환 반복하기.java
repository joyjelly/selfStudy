class Solution {
    public int[] solution(String s) {
        String noZero = s.replace("0","");
        int changecnt = 0;
        int byeZ = 0;
        System.out.println(noZero);
        while(!s.equals("1")){
            changecnt++;
            
            int nozero =s.replace("0","").length();
            byeZ = byeZ+s.length()-nozero;
            s =Integer.toBinaryString(nozero);
        }
        
        
        
    
        return new int[]{changecnt,byeZ};
    }
}