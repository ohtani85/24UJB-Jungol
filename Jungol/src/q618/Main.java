package q618;

import java.util.*;

class Person {
	String name;
	int height;
	double weight;

	public Person(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return String.format("%s %d %.1f", name, height, weight);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Person> persons = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			persons.add(new Person(name, height, weight));
		}

		// 이름순으로 정렬
		System.out.println("name");
		persons.stream().sorted(Comparator.comparing(p -> p.name)).forEach(System.out::println);

		// 몸무게가 무거운 순으로 정렬
		System.out.println("\nweight");
		persons.stream().sorted((p1, p2) -> Double.compare(p2.weight, p1.weight)).forEach(System.out::println);
		sc.close();
	}
}
