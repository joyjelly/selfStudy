import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        //시간
        int a = in.nextInt();
        //분
        int b = in.nextInt();
        int c = in.nextInt();
        int m = b+c;
        if(m>=60){
            a +=(m/60);
            //시간을 늘리고
            m = m % 60;//분에서 남은 시간
        }
        if(a>=24){//24시간이 넘으면
            a-=24;
        }
        System.out.println(a+" "+m);
    }
}