package q557;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		String[] ip = sc.nextLine().split(" ");
//		System.out.println(ip[0] + " " + ip[3] + " " + ip[6]);

		char[] ch = new char[10];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = sc.next().charAt(0);
		}
		sc.close();
		
		System.out.print(ch[0] + " ");
		System.out.print(ch[3] + " ");
		System.out.println(ch[6]);
	}
}