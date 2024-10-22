import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr= new int[N];
        
        for(int i =0;i<N;i++){
            int a = in.nextInt();
            arr[i] = a;
        }
        
        int b = in.nextInt();
        int answer = 0;
        for(int temp : arr){
            if(temp == b){
                answer++;
            }
        }
        
        
        System.out.println(answer);
    }
}