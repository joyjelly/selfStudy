import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i<a;i++){
            int b = in.nextInt();
            arr[i] =b;
        }
        double[] newArr = new double[a];
        int max = Arrays.stream(arr).max().getAsInt();
        for(int i = 0; i<a;i++){
            
             newArr[i] = (arr[i] / (double)max) * 100; 
        }
        double avg = Arrays.stream(newArr).average().getAsDouble();
        
        System.out.println(avg);
    }
}