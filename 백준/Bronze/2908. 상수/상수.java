import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int answer = 0;
        a = swap(a);
        b = swap(b);
        answer = Math.max(answer,a);
        answer = Math.max(answer,b);
        
        System.out.println(answer);
    }
    private static int swap(int x){
        int temp = 0;
        int res = 0;
        while(x>0){
            temp =x%10;
            res = res*10 + temp;
            x /=10;
        }
        return res;
        
    }
}