package q596;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 문자열 입력 받기
		String is = sc.next();

		// 정수 입력 받기
		int num = sc.nextInt();

		sc.close();

		// 입력받은 정수가 문자열 길이보다 크면 문자열 길이로 설정
		num = Math.min(num, is.length());

		// 문자열의 뒷부분부터 지정된 길이만큼 문자 출력
		String result = is.substring(is.length() - num);
		// 결과 출력
		System.out.println(new StringBuilder(result).reverse().toString());
	}
}