import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String[] input = in.nextLine().split(" ");
        
        String a = input[0];  
        int b = Integer.parseInt(input[1]);  
        
       
        System.out.println(Long.parseLong(a, b));
    }
}
