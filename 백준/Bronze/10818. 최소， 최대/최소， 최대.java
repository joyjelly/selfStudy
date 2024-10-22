import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        for(int i =0; i<a;i++){
            int b = in.nextInt();
            arr[i] = b;
        }
        int max= Arrays.stream(arr).max().getAsInt();
        int min= Arrays.stream(arr).min().getAsInt();
        System.out.print(min+" "+max);
    }
}