package q600;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		// �Է� ���ڿ��� ������ �������� �и��Ͽ� �ܾ� �迭�� ����
		String[] words = input.trim().split("\\s+"); // ���� ǥ���� \\s+�� �ϳ� �̻��� ������ ��Ÿ��

		// �Էµ� ���ڿ��� ���鸸 ���� ��� �ܾ� ������ 0
		int wordCount = (input.trim().isEmpty()) ? 0 : words.length;

		System.out.println(wordCount);
		sc.close();
	}
}
