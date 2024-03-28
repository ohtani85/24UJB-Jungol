package q614;

import java.util.Scanner;

//학교 정보를 저장할 클래스 정의
class SchoolInfo {
	String schoolName;
	int grade;

	// 생성자
	public SchoolInfo(String schoolName, int grade) {
		this.schoolName = schoolName;
		this.grade = grade;
	}

	// 학교 정보를 출력하는 메소드
	public void printInfo() {
		System.out.println(grade + " grade in " + schoolName + " School");
	}
}

public class Main {
	public static void main(String[] args) {
		// 첫 번째 변수를 초기화
		SchoolInfo first = new SchoolInfo("Jejuelementary", 6);

		Scanner scanner = new Scanner(System.in);

		// 사용자로부터 두 번째 학교의 정보 입력 받기
		String schoolName = scanner.next();
		int grade = scanner.nextInt();

		// 두 번째 변수 초기화
		SchoolInfo second = new SchoolInfo(schoolName, grade);

		// 두 변수의 정보 출력
		first.printInfo();
		second.printInfo();
		scanner.close();
	}
}
