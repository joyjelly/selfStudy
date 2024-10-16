import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String answer="";
        if(a>b){
            answer = ">";
        }else if(a<b){
           answer = "<"; 
        }else{
          answer = "==";    
        }
        
        System.out.println(answer);
    }
}