package q528;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		
		  System.out.println(num);
		  if (num < 0) {
	            System.out.println("minus");
		  }
	}

}