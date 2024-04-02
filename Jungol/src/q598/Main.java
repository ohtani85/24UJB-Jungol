package q598;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String inp = sc.next();
			char ch = inp.charAt(0);
			int asc = ch;

			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				System.out.println(inp);
			}

			else if (ch >= '0' && ch <= '9') {
				System.out.println(asc);
			}

			else {
				break;
			}
		}
		sc.close();
	}
}