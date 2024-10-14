class Solution {
    public String[] solution(String[] picture, int k) {

        String[] answer = new String[picture.length*k];
        for(int i =0; i<picture.length;i++){
            String str = copy(picture[i],k);
            for(int j = 0;j<k;j++){
                answer[i*k+j] = str;
            }
        }
        return answer;
    }
    private static String copy (String str,int k){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<str.length();i++){
            for(int j = 0;j<k;j++){
            sb.append(str.charAt(i));
                
            }
        }
        return sb.toString();
        
    }
}