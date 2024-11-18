import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        Stack<Integer>[] stacks = new Stack[4];
        for (int i = 0; i < 4; i++) {
            stacks[i] = new Stack<>();
        }
        
        // 각 숫자를 스택에 넣기
        for (int num : A) {
            boolean pushed = false;
            for (Stack<Integer> stack : stacks) {
                if (stack.isEmpty() || stack.peek() < num) {
                    stack.push(num);
                    pushed = true;
                    break;
                }
            }
            if (!pushed) {
                System.out.println("NO");
                return;
            }
        }
        
        // 각 스택이 감소하는 순서인지 확인
        for (Stack<Integer> stack : stacks) {
            int prev = Integer.MAX_VALUE;
            while (!stack.isEmpty()) {
                int curr = stack.pop();
                if (curr > prev) {
                    System.out.println("NO");
                    return;
                }
                prev = curr;
            }
        }
        
        System.out.println("YES");
    }
}