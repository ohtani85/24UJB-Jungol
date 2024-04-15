package q561;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}

		int maxUnder100 = -1; // 100 미만의 가장 큰 수를 찾기 위해 초기값 설정
		int minOver100 = 10001; // 100 이상의 가장 작은 수를 찾기 위해 초기값 설정

		for (int number : numbers) {
			if (number < 100 && number > maxUnder100) {
				maxUnder100 = number;
			} else if (number >= 100 && number < minOver100) {
				minOver100 = number;
			}
		}

		// 해당 범위에 수가 없는 경우 100 출력
		if (maxUnder100 == -1)
			maxUnder100 = 100;
		if (minOver100 == 10001)
			minOver100 = 100;

		System.out.println(maxUnder100 + " " + minOver100);
		sc.close();
	}
}
