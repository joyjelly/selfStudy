import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt(); 
        for (int i = 0; i < T; i++) {
            int R = in.nextInt(); 
            String S = in.next(); 
            
          
            for (char c : S.toCharArray()) {
                System.out.print(String.valueOf(c).repeat(R)); 
            }
            
            System.out.println();
        }
    }
}
