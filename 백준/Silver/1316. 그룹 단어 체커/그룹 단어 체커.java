import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        int cnt = 0;
        
        for (int i = 0; i < a; i++) {
            String b = in.nextLine();
            Set<Character> seen = new HashSet<>();
            boolean isGroupWord = true;
            
            for (int j = 0; j < b.length(); j++) {
                if (j > 0 && b.charAt(j) != b.charAt(j - 1) && seen.contains(b.charAt(j))) {
                    isGroupWord = false;
                    break;
                }
                seen.add(b.charAt(j));
            }
            
            if (isGroupWord) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}
