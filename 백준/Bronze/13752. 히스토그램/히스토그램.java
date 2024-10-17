import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int times = in.nextInt();
        for(int i =0; i<times;i++){
            int a = in.nextInt();
            print(a);
        }
        
    }
    private static void print(int x){
        for(int i =0; i<x;i++){
           System.out.print("=");
        }
        System.out.println();
    }
}