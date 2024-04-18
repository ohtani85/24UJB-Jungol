package q127;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0; // 입력된 수들의 합계
		int count = 0; // 입력된 유효한 수의 개수
		while (sc.hasNextInt()) {
			int number = sc.nextInt();
			if (number < 0 || number > 100) { // 숫자가 0-100 범위를 벗어나면 반복 종료
				break;
			}
			sum += number; // 유효한 숫자를 sum에 더함
			count++; // 유효한 숫자 개수 증가
		}
		sc.close();

		if (count > 0) {
			double average = (double) sum / count; // 평균 계산
			System.out.printf("sum : %d\n", sum); // 합계 출력
			System.out.printf("avg : %.1f\n", average); // 평균을 소수 첫째자리까지 출력
		}
	}
}
