class Solution {
    public int solution(int n) {
        int answer = 0;
        int compare =n;
        while(true){
            compare++;
            if(isSame(n,compare)){
                return compare;
            }else{
                continue;
            }
        }
        
     
    }
    private static boolean isSame(int x, int y){
      return  count(x)==count(y);
    }
    private static int count(int x){
        int cnt = 0;
        String bin = Integer.toBinaryString(x);
        for(int i = 0; i<bin.length();i++){
            if(bin.charAt(i)=='1'){
                cnt++;
            }
        }
        return cnt;
    }
}