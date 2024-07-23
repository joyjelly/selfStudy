class Solution {
    public int solution(int order) {
        int answer = 0;
        String strOrder = String.valueOf(order);
        String[] orderArr = strOrder.split("");
        for(int i =0; i<orderArr.length;i++){
            if(orderArr[i].equals("3")||orderArr[i].equals("6")||orderArr[i].equals("9")){
                answer++;
            }
        }
        return answer;
    }
}