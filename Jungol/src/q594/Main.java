package q594;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		if (input.length() <= 100) {
			System.out.println(input + input);
		}

		sc.close();
	}
}