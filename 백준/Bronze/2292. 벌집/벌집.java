import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a ==1){
            System.out.println(1);
            return;
        }
        int room = 1;
        int cnt =1;
        
        while(room<a){
            room+=6*cnt;
            cnt++;
        }
        System.out.println(cnt);
        
    }
}