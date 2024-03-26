package q558;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num1 = new int[100]; // 100개의 정수를 저장할 수 있는 배열 선언
		int count = 0; // 입력된 정수의 개수를 세기 위한 변수

		
		for (int i = 0; i < num1.length; i++) {
			int num2 = sc.nextInt();

			if (num2 == 0) // 0이 입력되면 입력 종료
				break;

			num1[i] = num2;
			count++;
		}
		sc.close();
		
        // 입력된 정수 역순으로 출력
		for (int i = count - 1; i >= 0; i--) {
			System.out.print(num1[i] + " ");
		}
	}
}