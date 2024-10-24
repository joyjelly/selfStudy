import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        a = a.toUpperCase();
        
        Map<Character, Integer> map = new HashMap<>();
        
        // 각 문자의 빈도수 계산
        for(char temp : a.toCharArray()) {
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        
        int max = 0;
        char maxChar = '?';
        boolean isDuplicate = false;
        
        // 최대 빈도수 찾기
        for(char key : map.keySet()) {
            int count = map.get(key);
            if(count > max) {
                max = count;
                maxChar = key;
                isDuplicate = false;
            } else if(count == max) {
                isDuplicate = true;
            }
        }
        
        // 결과 출력
        System.out.println(isDuplicate ? "?" : maxChar);
    }
}