package q601;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 (100자 이하):");
		String input = sc.nextLine();

		int length = input.length();
		// 문자열의 길이만큼 반복하여 회전된 결과를 출력
		for (int i = 0; i < length; i++) {
			// 문자열을 오른쪽으로 회전
			String rotated = input.substring(length - 1 - i) + input.substring(0, length - 1 - i);
			System.out.println(rotated);
		}

		sc.close();
	}
}
