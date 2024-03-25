package q532;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		scanner.close();
		
		if (num1 >= 4.0 && num2 >= 4.0) {
			System.out.println("A");
		} else if (num1 >= 3.0 && num2 >= 3.0) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}
}