import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] question = new String[n];
        int[] num = new int[n];
        int min = 100;
        int index = -1;
        for(int i = 0 ; i<n;i++){
            String a = in.next();
            question[i] = a;
            int b = in.nextInt();
            num[i] = b;
            if(min>b){
                min = b;
                index = i;
            }
        }
     
       
        System.out.println(question[index]);
    }
}