package q514;

import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner cc = new Scanner(System.in);
		System.out.print("height = ");
		int height = cc.nextInt();
		cc.close();
		
		System.out.println("Your height is "+ height + "cm.");
	}

}