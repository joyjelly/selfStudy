import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();
        
        for(int x = -999; x<=999; x++){
            for(int y = -999;y<=999;y++){
                if(a*x+b*y==c && d*x+e*y == f){
                    System.out.println(x+ " "+ y);
                    return;
                }
            }
        }
       
    }
}