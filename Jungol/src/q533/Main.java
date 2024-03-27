package q533;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String gender = sc.next(); // 성별 입력 ('M' 또는 'F')
		int age = sc.nextInt(); // 나이 입력

		// 성별과 나이에 따라 조건 분기
		if ("M".equals(gender)) {
			if (age >= 18) {
				System.out.println("MAN"); // 성인남자
			} else {
				System.out.println("BOY"); // 미성년남자
			}
		} else if ("F".equals(gender)) {
			if (age >= 18) {
				System.out.println("WOMAN"); // 성인여자
			} else {
				System.out.println("GIRL"); // 미성년여자
			}
		} 

		sc.close();
	}
}