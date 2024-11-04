import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // 코드1 수행 횟수 계산
        long result = (long) n * (n - 1) / 2;
        System.out.println(result); // 수행 횟수 출력
        System.out.println(2);      // 최고차항의 차수 출력
    }
}
