import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
         in.nextLine();
        int sum = 0;
         String b = in.nextLine();
        char[] c = b.toCharArray();
       for(char temp: c){
           int num = Integer.parseInt(String.valueOf(temp));
           if(num==0){
               continue;
           }
           sum+=num;
       }
        System.out.println(sum);
    }
}