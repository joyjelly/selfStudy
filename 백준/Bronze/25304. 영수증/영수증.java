import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int price = in.nextInt();
        int count = in.nextInt();
        int sum = 0;
        String answer = "";
        for(int i = 0; i<count;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            sum +=(a*b);
        }
        if(price == sum){
            answer = "Yes";
        }else{
            answer = "No";
        }
        System.out.println(answer);
    }
}