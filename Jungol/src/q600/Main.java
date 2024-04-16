package q600;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		// 입력 문자열의 공백을 기준으로 분리하여 단어 배열을 생성
		String[] words = input.trim().split("\\s+"); // 정규 표현식 \\s+는 하나 이상의 공백을 나타냄

		// 입력된 문자열이 공백만 있을 경우 단어 개수는 0
		int wordCount = (input.trim().isEmpty()) ? 0 : words.length;

		System.out.println(wordCount);
		sc.close();
	}
}
