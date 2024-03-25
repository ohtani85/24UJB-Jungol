package q530;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = 20 - num1;
		scanner.close();

		if (num1 >= 20) {
			System.out.println("adult");
		} else {
			System.out.println(num2 + " years later");
		}
	}
}