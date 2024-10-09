class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(isOdd(a)&&isOdd(b)){//모두 홀수
            return a*a+b*b;
        }else if(isOdd(a)||isOdd(b)){
            return 2*(a+b);
        }else{
            return Math.abs(a-b);
        }
      
    }
    private static boolean isOdd(int x){
        return x%2==1;
    }
}