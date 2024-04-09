package q618;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person {
	private String name;
	private int height;
	private double weight;

	public Person(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void print() {
		System.out.println(name + " " + height + " " + weight);
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] p = new Person[5];
		for (int i = 0; i < p.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();

			p[i] = new Person(name, height, weight);
		}
		sc.close();

		// name sort
		System.out.println("name");
		Arrays.sort(p, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				String name1 = o1.getName();
				String name2 = o2.getName();

				int strlen = Math.min(name1.length(), name2.length());
				for (int i = 0; i < strlen; i++) {
					if (name1.charAt(i) != name2.charAt(i)) {
						return name1.charAt(i) - name2.charAt(i);
					}
				}
				return 0;
			}
		});

		// print
		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}

		// weight sort
		System.out.println("weight");
		Arrays.sort(p, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				double weight1 = o1.getWeight();
				double weight2 = o2.getWeight();

				if (weight1 > weight2) {
					return 1;
				} else if (weight1 < weight2) {
					return -1;
				} else {
					return 0;
				}
			}
		});

		// print
		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}
	}
}