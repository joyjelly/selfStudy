import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();  // 올라가는 높이
        int B = in.nextInt();  // 미끄러지는 높이
        int V = in.nextInt();  
        int day = (V-B)/(A-B);
        if(((V-B)%(A-B))!=0){
            day++;
        }
       
        System.out.println(day);
    }
}
