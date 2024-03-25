package q539;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];
		int sum = 0;
		int count = 0;
		
		while (true) {
			int ip = sc.nextInt();
			num[count] = ip;
			sum += ip;
			count++;
			
			if (ip >=100) {
				break;
			}
		}
		
		double aver = (double) sum / count;
		
		System.out.println(sum);
		System.out.printf("%.1f\n", aver);
		
		sc.close();

	}
}