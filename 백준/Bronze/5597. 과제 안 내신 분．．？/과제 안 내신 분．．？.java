import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
       
  
        int[] arr = new int[31];
        for(int i=0;i<28;i++){
             int a = in.nextInt();
            arr[a]=1;
        }
        for(int i = 1;i<=30;i++){
            if(arr[i]==0){
                   System.out.println(i);
            }
        }
        
    }
}