package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = new char[10]; //10개짜리 문자를 저장할수 있는 배열을 선언

		for (int i = 0; i < ch.length; i++) {
			String input = sc.next();
			if (input.length() > 0) {
				ch[i] = input.charAt(0);
			}
		}

		for (char c : ch) {
			System.out.print(c);
		}

		sc.close();
	}
}