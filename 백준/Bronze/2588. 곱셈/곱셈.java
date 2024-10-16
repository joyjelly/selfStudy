import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = b;
        int temp = b%10;
        b/=10;
        System.out.println(a*(temp));
        temp = b%10;
        b/=10;
        System.out.println(a*(temp));
        temp = b%10;
        b/=10;                   
        System.out.println(a*(temp));
        System.out.println(a*c);
      
    }
}