package q559;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double[] aver = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };

		int class1 = sc.nextInt() -1;
		int class2 = sc.nextInt() -1;
		
		sc.close();
		
		double sum = aver[class1] + aver[class2];
		System.out.printf("%.1f", sum);
	}
}