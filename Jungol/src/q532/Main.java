package q532;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double number1 = scanner.nextDouble();
		double number2 = scanner.nextDouble();
		scanner.close();
		
		if (number1 >= 4.0 && number2 >= 4.0) {
			System.out.println("A");
		} else if (number1 >= 3.0 && number2 >= 3.0) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}
}