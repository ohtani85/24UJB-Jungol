package q125;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		// for loop
		for (int i = 1; i <= input; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// while loop
		int j = 1;
		while (j <= input) {
			System.out.print(j + " ");
			j++;
		}
		System.out.println();
		
		//do ~ while loop
		int k = 1;
        if (input >= 1) { 
            do {
                System.out.print(k + " ");
                k++;
            } while (k <= input);
        }
	}
}