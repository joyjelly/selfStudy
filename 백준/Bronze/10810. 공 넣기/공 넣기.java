import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] bucket = new int[N];
        
        int M = in.nextInt();
        for(int i = 0; i<M;i++ ){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            for(int j = a-1;j<=b-1;j++){
                bucket[j]=c;
            }

        }
         for(int temp: bucket){
             System.out.print(temp+" ");
         }
        
    }
}