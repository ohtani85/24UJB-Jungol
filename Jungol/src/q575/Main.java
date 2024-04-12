package q575;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int first = sc.nextInt();
		int second = sc.nextInt();

		int result = power(first, second);
		System.out.println(result);
		sc.close();
	}

	public static int power(int first, int second) {
		return (int) Math.pow(first, second);
	}
}