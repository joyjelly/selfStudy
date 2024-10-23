import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine().trim();  
        
        if(a.isEmpty()){  
            System.out.println(0);
        } else {
            String[] arr = a.split(" ");  
            System.out.println(arr.length);  
        }
    }
}
