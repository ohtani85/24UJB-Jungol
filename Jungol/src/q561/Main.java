package q561;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}

		int maxUnder100 = -1; // 100 �̸��� ���� ū ���� ã�� ���� �ʱⰪ ����
		int minOver100 = 10001; // 100 �̻��� ���� ���� ���� ã�� ���� �ʱⰪ ����

		for (int number : numbers) {
			if (number < 100 && number > maxUnder100) {
				maxUnder100 = number;
			} else if (number >= 100 && number < minOver100) {
				minOver100 = number;
			}
		}

		// �ش� ������ ���� ���� ��� 100 ���
		if (maxUnder100 == -1)
			maxUnder100 = 100;
		if (minOver100 == 10001)
			minOver100 = 100;

		System.out.println(maxUnder100 + " " + minOver100);
		sc.close();
	}
}
