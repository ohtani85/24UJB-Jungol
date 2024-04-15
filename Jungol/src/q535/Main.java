package q535;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double grade = sc.nextDouble();

		if (grade < 0 || grade > 4.5) {
			sc.close();
			return;
		}

		// �з� ���� �����ϱ� ���� ����
		int category;

		if (grade >= 4.0) {
			category = 1;
		} else if (grade >= 3.0) {
			category = 2;
		} else if (grade >= 2.0) {
			category = 3;
		} else {
			category = 4;
		}

		// switch���� ����Ͽ� ��� ���
		switch (category) {
		case 1:
			System.out.println("scholarship");
			break;
		case 2:
			System.out.println("next semester");
			break;
		case 3:
			System.out.println("seasonal semester");
			break;
		case 4:
			System.out.println("retake");
			break;
		default:
			System.out.println("Error: Invalid category.");
			break;
		}

		sc.close();
	}
}
