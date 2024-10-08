class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int total = brown+yellow;
        int max = (int)Math.sqrt(total);
        for(int vertical =3; vertical<=max;vertical++){
            if(total%vertical==0){//나눠떨어지면?
                int width = (int)(total/vertical);//가로길이
            if(brown==(width+vertical-2)*2){
                return new int[]{width,vertical};
            }
            }
        }
        return answer;
    }
}