import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        StringBuilder sb = new StringBuilder(a);
        String temp = sb.reverse().toString();
        int answer = 0;
        if(temp.equals(a)){
            answer =1;
        }
        
        
        System.out.println(answer);
    }
}