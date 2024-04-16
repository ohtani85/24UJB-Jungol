package q195;

import java.util.Scanner;

public class Main {
	String name;
	String tel;
	String addr;

	// ������
	public Main(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}

	// �Է¹��� ������ ����ϴ� �޼ҵ�
	public void printInfo() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + addr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		// �Է¹��� ���ڿ��� �������� �и�
		String[] parts = input.split(" ", 3); // �ִ� 3�κ����� �и��Ͽ� ���� �̸�, ��ȭ��ȣ, �ּҷ� ó��

		if (parts.length < 3) {

			sc.close();
			return;
		}

		// ����ü�� ���� Ŭ���� �ν��Ͻ� ����
		Main contact = new Main(parts[0], parts[1], parts[2]);

		// ���� ���
		contact.printInfo();

		sc.close();
	}
}
