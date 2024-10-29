import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();  // 입력된 방 번호
        int number = 1;        // 각 줄의 마지막 방 번호 합계
        int i = 1;             // 줄 번호 (대각선 번호)

        // 입력된 번호가 속한 줄 찾기
        while (a > number) {
            i++;
            number += i;       // i번째 줄의 마지막 방 번호 계산
        }

        int line = i;                     // a가 위치한 줄 번호
        int position = a - (number - line); // 줄 내에서의 위치

        int top, bottom;

        // 줄 번호가 짝수인지 홀수인지에 따라 분자와 분모 결정
        if (line % 2 == 0) {    // 짝수 줄
            top = position;
            bottom = line - position + 1;
        } else {                // 홀수 줄
            top = line - position + 1;
            bottom = position;
        }

        System.out.println(top + "/" + bottom);
    }
}
