package day0618;

/**
 * ���� ���� ���� n�� ���ڿ� control�� �־����ϴ�. control�� "w", "a", "s", "d"�� 4���� ���ڷ� �̷����
 * ������, control�� �տ������� ������� ���ڿ� ���� n�� ���� �ٲߴϴ�.
 * 
 * "w" : n�� 1 Ŀ���ϴ�. "s" : n�� 1 �۾����ϴ�. "d" : n�� 10 Ŀ���ϴ�. "a" : n�� 10 �۾����ϴ�. �� ��Ģ��
 * ���� n�� �ٲ��� �� ���� �������� ������ n�� ���� return �ϴ� solution �Լ��� �ϼ��� �ּ���.
 * 
 * @author PC2403
 *
 */
public class num {
	public int solution(int n, String control) {

		for (int i = 0; i < control.length(); i++) {
			switch (control.charAt(i)) {
			case 'w':
				n = n + 1;
				break;
			case 's':
				n = n - 1;
				break;
			case 'd':
				n = n + 10;
				break;
			case 'a':
				n = n - 10;
				break;
			}

		}
		return n;
	}
}
