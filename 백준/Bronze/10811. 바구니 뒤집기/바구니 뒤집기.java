import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
       int[] arr = new int[N+1];
        for(int i = 1 ; i<=N;i++){
            arr[i] = i;
        }
        
        for(int i =0; i<M;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            reverse(arr,a,b);
        }
        for(int i = 1;i<=N;i++ ){
             System.out.print(arr[i]+" ");
        }
       
    }
      private static void reverse(int[] arr, int a, int b) {
        while (a < b) {
          
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}