package q560;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int min = 1000; // 입력할 수 있는 최대값보다 1 큰 값으로 초기화
		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt(); // 정수 입력 받기
			if (num < min) { // 현재 입력받은 수가 지금까지의 최소값보다 작은 경우 업데이트
				min = num;
			}
		}

		System.out.println(min); // 가장 작은 수 출력

		sc.close();
	}
}