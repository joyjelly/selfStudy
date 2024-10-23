import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        for(int i =0; i<len;i++){
            String a = in.nextLine();
            int b = a.length();
             System.out.println(a.charAt(0)+""+a.charAt(b-1));
        }
      
       
    }
}