package day0618;

import java.util.Scanner;

/**
 * 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해
 * 보세요.
 * 
 * @author PC2403
 *
 */
public class SwapCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		StringBuilder sb = new StringBuilder(a.length());
		for (int i = 0; i < a.length(); i++) {
			char b = a.charAt(i);
			if (Character.isUpperCase(b)) {
				sb.append(Character.toLowerCase(b));
			} else {
				sb.append(Character.toUpperCase(b));
			}
		}
		System.out.println(sb.toString());
	}
}
