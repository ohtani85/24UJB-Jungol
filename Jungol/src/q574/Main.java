package q574;

import java.util.Scanner;

public class Main {

	// �� ���� ������ ���޹޾� �ִ밪�� ���ϴ� �Լ�
	public static int findMax(int a, int b, int c) {
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		// �ִ밪 ã��
		int max = findMax(num1, num2, num3);

		System.out.println(max);
		
		sc.close();
	}
}