package q516;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 실수 두 개와 문자 하나 입력 받기
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        char ct = scanner.next().charAt(0); // 문자열에서 첫 번째 문자를 가져옴
        
        // 실수는 반올림하여 소수 둘째자리까지, 문자는 그대로 출력
        System.out.printf("%.2f\n", num1);
        System.out.printf("%.2f\n", num2);
        System.out.println(ct);
    }
}
