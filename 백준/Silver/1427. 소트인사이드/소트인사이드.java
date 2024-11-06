import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
       String[] temp = a.split("");
        Integer[] arr= new Integer[temp.length];
        for(int i = 0; i<temp.length; i++){
            arr[i] = Integer.parseInt(temp[i]);
        }
        Arrays.sort(arr,Collections.reverseOrder());
        
        for(Integer i: arr){
            System.out.print(i);
        }
        
        
    }
}