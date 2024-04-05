package q599;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		StringBuilder result = new StringBuilder();

		// 문자열의 각 문자에 대해 루프
		for (int i = 0; i < inp.length(); i++) {
			char c = inp.charAt(i);
			// 알파벳인 경우에만 결과에 추가
			if (Character.isAlphabetic(c)) {
				result.append(Character.toUpperCase(c));
			}
		}

		System.out.println(result.toString());
		sc.close();
	}
}