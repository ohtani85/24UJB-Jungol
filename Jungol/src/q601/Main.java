package q601;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ��� (100�� ����):");
		String input = sc.nextLine();

		int length = input.length();
		// ���ڿ��� ���̸�ŭ �ݺ��Ͽ� ȸ���� ����� ���
		for (int i = 0; i < length; i++) {
			// ���ڿ��� ���������� ȸ��
			String rotated = input.substring(length - 1 - i) + input.substring(0, length - 1 - i);
			System.out.println(rotated);
		}

		sc.close();
	}
}
