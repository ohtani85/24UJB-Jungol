package q618;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            people.add(new Person(name, height, weight));
        }

        // 이름순으로 정렬
        for (int i = 0; i < people.size(); i++) {
            for (int j = 0; j < people.size() - 1; j++) {
                if (people.get(j).name.compareTo(people.get(j + 1).name) > 0) {
                    Person temp = people.get(j);
                    people.set(j, people.get(j + 1));
                    people.set(j + 1, temp);
                }
            }
        }

        System.out.println("name");
        for (Person person : people) {
            System.out.println(person);
        }

        // 몸무게가 무거운 순으로 정렬
        for (int i = 0; i < people.size(); i++) {
            for (int j = 0; j < people.size() - 1; j++) {
                if (people.get(j).weight < people.get(j + 1).weight) {
                    Person temp = people.get(j);
                    people.set(j, people.get(j + 1));
                    people.set(j + 1, temp);
                }
            }
        }

        System.out.println("\nweight");
        for (Person person : people) {
            System.out.println(person);
            sc.close();
        }
    }
}
