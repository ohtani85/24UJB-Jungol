package q536;

public class Main {
	public static void main(String[] args) {

		// 1. for loop
		for (int i = 1; i <= 15; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 2. while loop
		int num = 1;

		while (num <= 15) {
			System.out.print(num + " ");
			num++;
		}
		System.out.println();

		// 3. do ~ while loop
		int num2 = 1;
		do {
			System.out.print(num2 + " ");
			num2++;
		} while (num2 <= 15);
		System.out.println();

		// 4. do ~ while loop 맨 마지막 공백 제거
		int num3 = 1;
		do {
			if (num3 == 15) {
				System.out.print(num3);
			} else {
				System.out.print(num3 + " ");
			}
			num3++;
		} while (num3 <= 15);
	}
}