package q613;

import java.util.Scanner;

//학생 정보를 저장할 클래스 정의
class Student {
	String name;
	String school;
	int grade;

	// 생성자
	public Student(String name, String school, int grade) {
		this.name = name;
		this.school = school;
		this.grade = grade;
	}

	// 학생 정보를 출력하는 메소드
	public void printInfo() {
		System.out.println("Name : " + name);
		System.out.println("School : " + school);
		System.out.println("Grade : " + grade);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 사용자로부터 입력 받기
		String input = sc.nextLine();
		String[] parts = input.split(" ");

		// 입력받은 정보를 바탕으로 Student 객체 생성
		Student student = new Student(parts[0], parts[1], Integer.parseInt(parts[2]));

		// 학생 정보 출력
		student.printInfo();
		sc.close();
	}
}