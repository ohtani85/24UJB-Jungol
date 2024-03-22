package q515;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();      
        
        // 곱셈 결과
        int value1 = num1 * num2;
        // 몫 계산
        int value2 = num1 / num2;

        // 결과 출력14
        System.out.println(num1 + " * " + num2 + " = " + value1);
        System.out.println(num1 + " / " + num2 + " = " + value2);
		
		
	}
}
