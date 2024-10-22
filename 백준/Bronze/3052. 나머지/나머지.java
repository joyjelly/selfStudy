import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        for(int i =0; i<10; i++){
            int a = in.nextInt();
            set.add(a%42);
        }
        System.out.println(set.size());
        
    }
}