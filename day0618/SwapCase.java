package day0618;

import java.util.Scanner;

/**
 * ���� ���ĺ����� �̷���� ���ڿ� str�� �־����ϴ�. �� ���ĺ��� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�ؼ� ����ϴ� �ڵ带 �ۼ���
 * ������.
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
