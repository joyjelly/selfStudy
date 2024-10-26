import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] arr = new char[5][15];
        
        // 입력 처리
        for (int i = 0; i < 5; i++) {
            String a = in.nextLine();
            for (int j = 0; j < a.length(); j++) {
                arr[i][j] = a.charAt(j);
            }
        }
        
        // 세로로 읽어 출력
        for (int i = 0; i < 15; i++) {  // 열을 먼저 순회
            for (int j = 0; j < 5; j++) { // 행을 순회
                if (arr[j][i] != '\0') {  // 빈 값이 아닌 경우만 출력
                    System.out.print(arr[j][i]);
                }
            }
        }
    }
}
