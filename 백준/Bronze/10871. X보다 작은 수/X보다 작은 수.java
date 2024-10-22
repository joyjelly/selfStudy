import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr= new int[N];
        int a = in.nextInt(); //기준 수
        
        for(int i =0;i<N;i++){
             int b = in.nextInt();
            arr[i] = b;
        }
        
        List<Integer> list = new ArrayList<>();
        for(int temp : arr){
            if(temp < a){
                list.add(temp);
            }
        }
        for(int temp : list){
         
             System.out.print(temp+" ");
            
        }
        
        
    }
}