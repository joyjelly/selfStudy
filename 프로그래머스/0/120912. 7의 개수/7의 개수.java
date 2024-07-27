class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i =0; i<array.length;i++){
            String temp = String.valueOf(array[i]);
            String[] arr = temp.split("");
            for(String c : arr){
                if(c.equals("7")){
                    answer++;
                }
            }
        }
        return answer;
    }
}