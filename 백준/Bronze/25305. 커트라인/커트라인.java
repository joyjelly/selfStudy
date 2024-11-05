import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.nextLine();
        String temp =  in.nextLine();
        String[] str = temp.split(" ");
        int[] arr = new int[a];
        for(int i = 0; i<a; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(arr);
        
        
        
        
        System.out.println(arr[a-b]);
    }
}