package q534;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char inp = sc.next().charAt(0);

		if (inp == 'A') {
			System.out.println("Excellent");
		} else if (inp == 'B') {
			System.out.println("Good");
		} else if (inp == 'C') {
			System.out.println("Usually");
		} else if (inp == 'D') {
			System.out.println("Effort");
		} else if (inp == 'F') {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		}

//        char inp = sc.next().charAt(0);
//
//        switch (inp) {
//            case 'A':
//                System.out.println("Excellent");
//                break;
//            case 'B':
//                System.out.println("Good");
//                break;
//            case 'C':
//                System.out.println("Usually");
//                break;
//            case 'D':
//                System.out.println("Effort");
//                break;
//            case 'F':
//                System.out.println("Failure");
//                break;
//            default:
//                System.out.println("error");
//                break;
//        }

		sc.close();
	}
}