import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int answer = 0;
        if(a>0&&b>0){
            answer = 1;
        }else if(a>0&&b<0){
            answer = 4;
        }else if(a<0&&b<0){
            answer = 3;
        }else{
            answer = 2;
        }
        System.out.println(answer);
    }
}