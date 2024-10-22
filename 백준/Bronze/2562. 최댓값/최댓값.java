import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int[] arr = new int[9];
        for(int i =0; i< 9; i++){
            int b = in.nextInt();
            arr[i] = b;
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int answer = -1;
        for(int i =0; i<9;i++){
            if(max ==arr[i]){
                answer = i+1;
            }
        }
        
        System.out.println(max);
        System.out.println(answer);
    }
}