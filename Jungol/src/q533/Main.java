package q533;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String gender = sc.next(); // 성별 입력 ('M' 또는 'F')
		int age = sc.nextInt(); // 나이 입력


		if ("M".equals(gender)) {
			if (age >= 18) {
				System.out.println("MAN");
			} else {
				System.out.println("BOY");
			}
		} else if ("F".equals(gender)) {
			if (age >= 18) {
				System.out.println("WOMAN");
			} else {
				System.out.println("GIRL");
			}
		} 

		sc.close();
	}
}