import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M= in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
    arr[i] = i + 1; 
        
}
        
        for(int i = 0; i<M;i++){
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            int temp = arr[a];
            arr[a]= arr[b];
            arr[b] =temp;
            
        }
      for(int temp : arr){
          System.out.print(temp+" ");
      }
        
    }
}