class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] answer = new int[length];
        if(direction.equals("right")){          
                    answer[0]=numbers[length-1];             
            for(int i =0;i<length-1;i++){
                answer[i+1] =numbers[i];                
            }
        }else{
            answer[length-1] = numbers[0];
            for(int j =0;j<length-1;j++){
                answer[j]=numbers[j+1];
            }
        }
        return answer;
    }
}