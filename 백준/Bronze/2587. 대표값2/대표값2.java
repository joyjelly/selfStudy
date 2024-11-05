import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int avg =0;
        for(int i = 0; i<5; i++){
            int a = in.nextInt();
            arr[i] = a;
            avg +=a;
        }
       Arrays.sort(arr);
       
        System.out.println((int)avg/5);
        System.out.println(arr[2]);
    }
}