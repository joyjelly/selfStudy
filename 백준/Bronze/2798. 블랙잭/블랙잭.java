import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); 
        int M = in.nextInt(); //합
        int[] arr = new int[N];
        for(int i = 0; i<N;i++){
            int a = in.nextInt(); 
            arr[i] =a;
        }
        int max = 0;
        for(int i = 0; i<N;i++){
            for(int j = i+1;j<N;j++){
                for(int k = j+1; k<N;k++){
                  int sum=  arr[i]+arr[j]+arr[k];
                    if(sum>max&&sum<=M){
                        max =sum;
                    }
                }
            }
        }
      
        System.out.println(max);
    }
}