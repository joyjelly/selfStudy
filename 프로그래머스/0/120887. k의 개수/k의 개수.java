class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strK = String.valueOf(k);
        for(int s=i; s<=j;s++){
          String temp = String.valueOf(s);
            String[] arr = temp.split("");
            for(String c : arr){
                if(c.equals(strK)){
                    answer++;
                }
            }
        }
        return answer;
    }
}