import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = {1,1,2,2,2,8};
        for(int i =0; i<6;i++){
            String a = in.next();
            int b = Integer.parseInt(a);
            System.out.print((arr[i]-b)+" ");
        }
        
    }
}