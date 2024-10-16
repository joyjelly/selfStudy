import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();//횟수
        
        for(int i = 0; i<a; i++){
            int b = in.nextInt();
            int c = in.nextInt();
            System.out.println(b+c);
        }
        
    }
}