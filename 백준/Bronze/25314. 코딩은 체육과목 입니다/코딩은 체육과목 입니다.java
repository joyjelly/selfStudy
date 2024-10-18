import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
       StringBuilder sb = new StringBuilder();
        
        for(int i =0;i<a/4;i++){
            sb.append("long ");
        }
        sb.append("int");
        
        System.out.println(sb.toString());
    }
}