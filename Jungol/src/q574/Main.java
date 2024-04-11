package q574;

import java.util.Scanner;

public class Main {

	// 세 개의 정수를 전달받아 최대값을 구하는 함수
	public static int findMax(int a, int b, int c) {
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		// 최대값 찾기
		int max = findMax(num1, num2, num3);

		System.out.println(max);
		
		sc.close();
	}
}