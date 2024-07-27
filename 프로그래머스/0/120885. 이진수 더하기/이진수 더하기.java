class Solution {
    public String solution(String bin1, String bin2) {
        int result = 0;

        while(!bin1.isEmpty()){
            if(bin1.startsWith("1")){
                int temp = 1;
                for(int i = 1; i < bin1.length(); i++){
                    temp *= 2;
                }
                result += temp;
            
            }
            bin1 = bin1.substring(1); 
        }

        while(!bin2.isEmpty()){
            if(bin2.startsWith("1")){
                int temp2 = 1;
                for(int j = 1; j < bin2.length(); j++){
                    temp2 *= 2;
                }
                result += temp2;
             
            }
            bin2 = bin2.substring(1); 
        }

        StringBuilder sb = new StringBuilder();
        if (result == 0) {
            return "0";
        }

        while(result > 0){
            if(result % 2 == 0){
           
                sb.append("0"); 
            } else {              
                sb.append("1"); 
            }
            result /= 2;
        }
        
    
        return sb.reverse().toString(); 
    }
}
