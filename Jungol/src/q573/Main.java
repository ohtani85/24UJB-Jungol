package q573;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		printNumberSquare(n);
		sc.close();
	}

	private static void printNumberSquare(int n) {
		int number = 1; 
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(number + " ");
				number++; 
			}
			System.out.println();
		}
	}
}
