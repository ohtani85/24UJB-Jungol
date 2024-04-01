package q597;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        String first = scanner.nextLine();
        total += first.length();

        String second = scanner.nextLine();
        total += second.length();

        System.out.println(total);

        scanner.close();
    }
}