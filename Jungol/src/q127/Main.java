package q127;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0; // �Էµ� ������ �հ�
		int count = 0; // �Էµ� ��ȿ�� ���� ����
		while (sc.hasNextInt()) {
			int number = sc.nextInt();
			if (number < 0 || number > 100) { // ���ڰ� 0-100 ������ ����� �ݺ� ����
				break;
			}
			sum += number; // ��ȿ�� ���ڸ� sum�� ����
			count++; // ��ȿ�� ���� ���� ����
		}
		sc.close();

		if (count > 0) {
			double average = (double) sum / count; // ��� ���
			System.out.printf("sum : %d\n", sum); // �հ� ���
			System.out.printf("avg : %.1f\n", average); // ����� �Ҽ� ù°�ڸ����� ���
		}
	}
}
