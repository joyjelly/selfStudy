import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int answer = 0;
      if(a==b&&b==c&&c==a){
          answer = 10000+(a)*1000;
      }else if(a!=b&&b!=c&&c!=a){
          int max = Math.max(a,b);
          max = Math.max(max,c);
          answer = max*100;
      }else{
          if (a == b || a == c) {
                answer = 1000 + a * 100;
            } else if (b == c) {
                answer = 1000 + b * 100;
            }
      }
       System.out.println(answer);
    }
}