package q572;

import java.util.Scanner;

public class Main {
	public static double cal(double r) {
		return r * r * 3.14; // 원의 넓이 계산식
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble(); // 반지름 입력 받기
		double area = cal(radius); // 원의 넓이 계산
		System.out.printf("%.2f", area); // 소수 둘째 자리까지 출력

		sc.close();
	}
}