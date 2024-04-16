package q195;

import java.util.Scanner;

public class Main {
	String name;
	String tel;
	String addr;

	// 생성자
	public Main(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}

	// 입력받은 정보를 출력하는 메소드
	public void printInfo() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + addr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		// 입력받은 문자열을 공백으로 분리
		String[] parts = input.split(" ", 3); // 최대 3부분으로 분리하여 각각 이름, 전화번호, 주소로 처리

		if (parts.length < 3) {

			sc.close();
			return;
		}

		// 구조체와 같은 클래스 인스턴스 생성
		Main contact = new Main(parts[0], parts[1], parts[2]);

		// 정보 출력
		contact.printInfo();

		sc.close();
	}
}
